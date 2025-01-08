import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		// Kiểm tra ngữ cảnh Spring khởi động thành công
	}

	@Test
	void mainMethodTest() {
		// Tạo mock cho SpringApplication
		SpringApplication mockSpringApplication = mock(SpringApplication.class);

		// Gọi phương thức main
		DemoApplication.main(new String[]{});

		// Không có lỗi, nghĩa là hàm main đã chạy thành công
	}
}
