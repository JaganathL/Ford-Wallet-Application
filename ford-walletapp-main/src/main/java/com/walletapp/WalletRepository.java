package com.walletapp;

import java.util.List;

public interface WalletRepository {
    WalletDto createWallet(WalletDto newWallet);
  //  WalletDto getWalletById(Integer  walletId);
  /*  WalletDto updateWallet(WalletDto wallet,Integer id);
    WalletDto deleteWalletById(Integer walletId);
    */
  List<WalletDto> getAllWallets();
}
