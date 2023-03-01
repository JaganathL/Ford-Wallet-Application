package com.walletapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class WalletAppApplicationTests {
//
//	WalletDto registerWallet(WalletDto wallet)throws WalletException ;
//	WalletDto getWalletById(Integer walletId) throws WalletException;
//	WalletDto updateWallet(WalletDto wallet)throws WalletException;
//	WalletDto deleteWalletById(Integer walletId)throws WalletException;
//
//
//	Double addFundsToWalletById(Integer walletId,Double amount)throws WalletException;
//	Double withdrawFundsFromWalletById(Integer walletById,Double amount) throws WalletException;
//	Boolean fundTransfer(Integer fromWalletId,Integer toWalletId,Double amount)throws WalletException;
//
//	List<WalletDto> getAllWallets();
    @Autowired
	private WalletService walletService;

	@Test
	void registerTest() throws WalletException {
		WalletDto emp = new WalletDto(1,"Ford",25000.0);
		assertEquals("Ford",this.walletService.registerWallet(emp).getName());
	}
	@Test
	void getWalletByIdThrowsExceptionTest() {

		assertThrows(WalletException.class,()->this.walletService.getWalletById(1000));
	}

}
