package com.walletapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "http://localhost:4200/")
public class WalletController {
    @Autowired
     private WalletService walletService;
    @GetMapping("/Home")
    public String greet(){
        return "Hello welcome to wallet app.";
    }
    @PostMapping("/wallet")
    @ResponseStatus(value = HttpStatus.CREATED)
    public WalletDto Register(@RequestBody @Valid WalletDto wallet)throws WalletException{
        return this.walletService.registerWallet(wallet);
    }
    @GetMapping("/wallet")
    public List<WalletDto> getAllWallets(){
        System.out.println(this.walletService.getAllWallets());
        return this.walletService.getAllWallets();
    }
    @GetMapping("/wallet/{walletId}")
    public WalletDto getWalletById(@PathVariable Integer walletId)throws WalletException{
        System.out.println(this.walletService.getWalletById(walletId));
        return this.walletService.getWalletById(walletId);
}
@DeleteMapping("/wallet/{walletId}")
    public WalletDto deleteWalletById(@PathVariable Integer walletId)throws WalletException{
        return walletService.deleteWalletById(walletId);
}
@PutMapping("/wallet")
    public  WalletDto updateWallet(@RequestBody WalletDto wallet)throws WalletException{
        return walletService.updateWallet(wallet);
}
@PatchMapping("/wallet/{walletId}/{amount}")
    public Double addFundsToWalletById(@PathVariable Integer walletId,@PathVariable Double amount)throws WalletException{
        return walletService.addFundsToWalletById(walletId,amount);
}
@PutMapping("/wallet/withdraw/{walletById}/{amount}")
    public Double withdrawFundsFromWalletById(@PathVariable Integer walletById,@PathVariable Double amount)throws WalletException{
        return walletService.withdrawFundsFromWalletById(walletById,amount);
}
@PutMapping("/wallet/{fromWalletId}/{toWalletId}/{amount}")
    public Boolean fundTransfer(@PathVariable Integer fromWalletId,@PathVariable Integer toWalletId,@PathVariable Double amount)throws WalletException{
        return walletService.fundTransfer(fromWalletId, toWalletId, amount);
}
@GetMapping("/wallet/login/{id}/{pass}")
    public Boolean login(@PathVariable Integer id,@PathVariable String pass) throws WalletException {
        return walletService.login(id,pass);
}
}
