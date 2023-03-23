package com.walletapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WalletServiceTest {
   /* WalletDto registerWallet(WalletDto wallet) throws WalletException ;
    WalletDto getWalletById(Integer walletId) throws WalletException;
    WalletDto updateWallet(WalletDto wallet,Integer id)throws WalletException;
    WalletDto deleteWalletById(Integer walletId)throws WalletException;


    Double addFundsToWalletById(Integer walletId, Double amount) throws WalletException;

    Double withdrawFundsFromWalletById(Integer walletById,Double amount)throws WalletException;
    Boolean fundTransfer(Integer fromWalletId,Integer toWalletId,Double amount)throws WalletException;
*/
  /* @Value(value="${local.server.port}")
   private int port;

    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private WalletService walletService;
    @BeforeEach
    public void init(){
        this.restTemplate.postForObject("http://localhost:" + port + "/wallet",new WalletDto(1,"Ford",25000.0),WalletDto.class);
    }
    @Test
    public void deleteWalletByIdTest() throws WalletException{
        //  WalletDto wallet =this.restTemplate.getForObject("http://localhost:" + port + "/wallet/2", WalletDto.class);
        WalletDto wallet=new WalletDto(1,"jagan",1000.0);
        walletService.deleteWalletById(1);
        Assertions.assertEquals(1,wallet.getId());
    }
    @Test
    public void registerWallet() throws WalletException{
        WalletDto wallet=walletService.registerWallet(new WalletDto(1,"jagan",1000.0));

        Assertions.assertEquals(1,wallet.getId());
    }
   @Test
    public void updateWalletTest() throws WalletException{
       WalletDto wallet=new WalletDto(1,"jagan",1000.0);
       walletService.updateWallet(wallet,1);
       Assertions.assertEquals("jagan",wallet.getName());
   }
   @Test
    public void addFundsToWalletByIdTest() throws WalletException {
       WalletDto wallet=new WalletDto(1,"jagan",1000.0);
       walletService.addFundsToWalletById(wallet.getId(), wallet.getBalance());
       Assertions.assertEquals(1000.0,wallet.getBalance());
   }
   @Test
    public void withdrawFundsFromWalletByIdTest() throws WalletException{
       WalletDto wallet=new WalletDto(1,"jagan",1000.0);
       walletService.withdrawFundsFromWalletById(wallet.getId(), wallet.getBalance());
       Assertions.assertEquals(1000.0,wallet.getBalance());
   }
   @Test
    public void fundTransferTest()throws WalletException{
       WalletDto wallet1=walletService.registerWallet(new WalletDto(2,"jagan",1000.0));
       WalletDto wallet2=walletService.registerWallet(new WalletDto(3,"navin",1000.0));

       walletService.fundTransfer(wallet1.getId(), wallet2.getId(), 500.0 );
       Assertions.assertEquals(500.0,wallet1.getBalance());
   }
*/
}
