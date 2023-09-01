package com.vti.booking_tour.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Database {
    @Bean //khi chạy các lệnh thì sẽ chạy qua hàm này đầu tiên
    CommandLineRunner initDatabase(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // khởi tạo các giá trị ở đây
            }
        };
    }
}
