package microservices.book.multiplication.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
class RandomGeneratorServiceImpl implements RandomGeneratorService {

    final static int MINIMUM_FACTOR = 11;
    final static int MAXIMUM_FACTOR = 99;

    @Override
    public int generateRandomFactor() {
        return new Random().nextInt((MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
        /**
         * 預設無邏輯回傳為0使促測試程式碼經過assert驗證
         * **/
//    	return 0;
    }
}
