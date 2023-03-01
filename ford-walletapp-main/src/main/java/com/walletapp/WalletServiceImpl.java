package com.walletapp;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

//@Service
public class WalletServiceImpl {
  /*  @Autowired
    private WalletRepository walletRepository;

    @Override
    public WalletDto registerWallet(WalletDto wallet) throws WalletException {
        return walletRepository.createWallet(wallet);
    }

  /*  @Override
    public WalletDto getWalletById(Integer walletId)throws WalletException {
        return walletRepository.getWalletById(walletId);
    }
/*
    @Override
    public WalletDto updateWallet(WalletDto wallet,Integer id) throws WalletException{
        return walletRepository.updateWallet(wallet,id);
    }

    @Override
    public WalletDto deleteWalletById(Integer walletId) throws WalletException {
        return walletRepository.deleteWalletById(walletId);
    }

    @Override
    public Double addFundsToWalletById(Integer walletId, Double amount)throws WalletException {
        Double b=null;

        WalletDto wallet=walletRepository.getWalletById(walletId);
        if(wallet==null){
            throw new WalletException("id not found");
        }
        wallet.setBalance(wallet.getBalance(),amount);
        b=wallet.getBalance();
        return b;
    }

    @Override
    public Double withdrawFundsFromWalletById(Integer walletById, Double amount)throws WalletException {
        Double b=null;
       WalletDto wallet=walletRepository.getWalletById(walletById);
        wallet.setBalancewithdraw(wallet.getBalance(),amount);
        b=wallet.getBalance();

        return b;
    }

    @Override
    public Boolean fundTransfer(Integer fromWalletId, Integer toWalletId, Double amount)throws WalletException {


        withdrawFundsFromWalletById(fromWalletId,amount);
        addFundsToWalletById(toWalletId,amount);
        return true;
    }

    @Override
    public List<WalletDto> getAllWallets() {
        return walletRepository.getAllWallets();
    }*/
}
