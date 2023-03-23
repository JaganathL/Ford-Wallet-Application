package com.walletapp;

import java.util.List;
import java.util.Optional;

public interface WalletService {

    WalletDto registerWallet(WalletDto wallet) throws WalletException ;
    WalletDto getWalletById(Integer walletId) throws WalletException;
    WalletDto updateWallet(WalletDto wallet)throws WalletException;
    WalletDto deleteWalletById(Integer walletId)throws WalletException;
    Boolean login(Integer id,String pass) throws WalletException;

    Double addFundsToWalletById(Integer walletId, Double amount) throws WalletException;

    Double withdrawFundsFromWalletById(Integer walletById,Double amount)throws WalletException;
    Boolean fundTransfer(Integer fromWalletId,Integer toWalletId,Double amount)throws WalletException;

    List<WalletDto> getAllWallets();
}
