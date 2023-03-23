package com.walletapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WalletJpaServiceImpl implements WalletService {
    @Autowired
   private WalletJpaRepository walletJpaRepository;

    @Override
    public WalletDto registerWallet(WalletDto wallet) throws WalletException {
        return this.walletJpaRepository.save(wallet);
    }

    @Override
    public WalletDto getWalletById(Integer walletId) throws WalletException {
        Optional<WalletDto> walletOptional = this.walletJpaRepository.findById(walletId);
        if(walletOptional.isEmpty())
            throw new WalletException("Wallet could not be found id:"+walletId);

        return walletOptional.get();
    }

    @Override
    public WalletDto updateWallet(WalletDto wallet) throws WalletException {
        Optional<WalletDto> employeeOptional = this.walletJpaRepository.findById(wallet.getId());
        if(employeeOptional.isEmpty())
            throw new WalletException("Wallet could not be updated, not found id:"+wallet.getId());
        return this.walletJpaRepository.save(wallet);
    }

    @Override
    public WalletDto deleteWalletById(Integer walletId) throws WalletException {
        Optional<WalletDto> employeeOptional = this.walletJpaRepository.findById(walletId);
        if(employeeOptional.isEmpty())
            throw new WalletException("Wallet could not be Deleted, not found id:"+walletId);
        WalletDto foundWallet = employeeOptional.get();
        this.walletJpaRepository.delete(foundWallet);
        return foundWallet;
    }

    @Override
    public Double addFundsToWalletById(Integer walletId, Double amount) throws WalletException {
        WalletDto wallet=getWalletById(walletId);
        wallet.setBalance(wallet.getBalance(),amount);
        this.walletJpaRepository.save(wallet);
        return wallet.getBalance();
    }

    @Override
    public Boolean login(Integer id, String pass) throws WalletException {
        WalletDto wallet=getWalletById(id);
        if(wallet.getPass().equals(pass)){
            return true;
        }
        return false;
    }

    @Override
    public Double withdrawFundsFromWalletById(Integer walletById, Double amount) throws WalletException {
        WalletDto wallet=getWalletById(walletById);
        if(wallet.getBalance()<amount)
            throw new WalletException("Check balance, Balance is less then withdraw amount");

        wallet.setBalancewithdraw(wallet.getBalance(),amount);
        this.walletJpaRepository.save(wallet);
        return wallet.getBalance();
    }

    @Override
    public Boolean fundTransfer(Integer fromWalletId, Integer toWalletId, Double amount) throws WalletException {
        withdrawFundsFromWalletById(fromWalletId,amount);
        addFundsToWalletById(toWalletId,amount);
        return true;
    }

    @Override
    public List<WalletDto> getAllWallets() {
        return this.walletJpaRepository.findAll();
    }
}
