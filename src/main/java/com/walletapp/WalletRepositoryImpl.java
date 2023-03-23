package com.walletapp;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class WalletRepositoryImpl implements WalletRepository{
    ArrayList<WalletDto> wal=new ArrayList<>();
    @Override
    public WalletDto createWallet(WalletDto newWallet) {
        wal.add(newWallet);
        return newWallet;
    }

  /*  @Override
    public WalletDto getWalletById(Integer walletId) {
        WalletDto b=null;
        for(WalletDto a:wal) {
            if (walletId.equals(a.getId())) {
                b = a;
                break;
            }
        }
        return b;
    }

  /*  @Override
    public WalletDto updateWallet(WalletDto wallet,Integer id) {
        int b=0;
        WalletDto c=null;
        for(WalletDto a:wal){
            if(id.equals(a.getId())){
                wal.set(b,wallet);
                c=wal.get(b);
            }
            b++;
        }
        return c;
    }
*/
    @Override
    public List<WalletDto> getAllWallets() {
        return wal;
    }
/*
    @Override
    public WalletDto deleteWalletById(Integer walletId) {
        WalletDto b=null;
        for(WalletDto a:wal){
            if(walletId.equals(a.getId())){
                b=a;
                wal.remove(a);
                break;
            }
        }
        return b;
    }*/
}
