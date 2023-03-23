package com.walletapp;
import com.walletapp.WalletDto;
import com.walletapp.WalletException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WalletControllerTest {
    @Value(value="${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;
     @Autowired
     private WalletService walletService1;
    @BeforeEach
    public void init(){
        this.restTemplate.postForObject("http://localhost:" + port + "/wallet",new WalletDto(1,"Ford",25000.0),WalletDto.class);
    }
    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/Home",
                String.class)).contains("Hello welcome to wallet app.");
    }

    @Test
    public void getWalletByIdTest() throws WalletException {
        WalletDto foundWallet =this.restTemplate.getForObject("http://localhost:" + port + "/wallet/1", WalletDto.class);
        Assertions.assertEquals("Ford",foundWallet.getName());
    }



    @Test
    public void getWalletByIdExceptionTest() throws WalletException {
        String walletExceptionMessage =this.restTemplate.getForObject("http://localhost:" + port + "/wallet/2", String.class);
        Assertions.assertEquals(" Id does not exists.",walletExceptionMessage);
    }

}
