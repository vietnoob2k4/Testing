# Báo cáo kiểm thử: Chương trình tính tổng hai số (Cập nhật)

---

## 1. Mô tả chương trình  
Chương trình tính tổng hai số nguyên được xây dựng bằng Java Spring Boot. Chức năng chính của chương trình là nhận đầu vào là hai số nguyên và tính tổng của chúng. Các phương thức kiểm thử đơn vị được xây dựng bằng JUnit để kiểm tra tính đúng đắn của hàm tính tổng trong các tình huống khác nhau, bao gồm các trường hợp đặc biệt như số âm, số 0 và giá trị null.

---

## 2. Mô tả code  
- **CalculatorService**: Lớp chính chứa phương thức tính tổng (`sum`) của hai số nguyên. Phương thức này xử lý các trường hợp kiểm tra giá trị null và đảm bảo các tham số đầu vào là số nguyên hợp lệ.  
- **CalculatorServiceTest**: Lớp kiểm thử đơn vị sử dụng JUnit để kiểm tra tính đúng đắn của phương thức `sum`. Các test case bao gồm các trường hợp kiểm thử tổng của các số dương, âm, số 0, cũng như các tình huống đầu vào không hợp lệ như giá trị null hoặc kiểu dữ liệu không đúng.

---

## 3. Kế hoạch kiểm thử  
- **Test 1**: Kiểm tra tổng hai số dương.  
  - **Đầu vào**: `3` và `5`  
  - **Kết quả mong đợi**: `8`

- **Test 2**: Kiểm tra tổng hai số âm.  
  - **Đầu vào**: `-3` và `-5`  
  - **Kết quả mong đợi**: `-8`

- **Test 3**: Kiểm tra tổng của một số âm và một số dương.  
  - **Đầu vào**: `-3` và `5`  
  - **Kết quả mong đợi**: `2`

- **Test 4**: Kiểm tra tổng với một số 0.  
  - **Đầu vào**: `5` và `0`  
  - **Kết quả mong đợi**: `5`  
  - **Đầu vào**: `0` và `5`  
  - **Kết quả mong đợi**: `5`

- **Test 5**: Kiểm tra tổng hai số 0.  
  - **Đầu vào**: `0` và `0`  
  - **Kết quả mong đợi**: `0`

- **Test 6**: Kiểm tra tổng khi có một trong các giá trị đầu vào là null.  
  - **Đầu vào**: `null` và `5`  
  - **Kết quả mong đợi**: `IllegalArgumentException` với thông báo "Inputs must not be null"  
  - **Đầu vào**: `5` và `null`  
  - **Kết quả mong đợi**: `IllegalArgumentException` với thông báo "Inputs must not be null"

- **Test 7**: Kiểm tra tổng khi có một trong các giá trị đầu vào là kiểu dữ liệu không hợp lệ (không phải số nguyên).  
  - **Đầu vào**: `"abc"` và `5`  
  - **Kết quả mong đợi**: `IllegalArgumentException` với thông báo "Inputs must be numbers"  
  - **Đầu vào**: `5` và `"xyz"`  
  - **Kết quả mong đợi**: `IllegalArgumentException` với thông báo "Inputs must be numbers"

---

## 4. Tổng hợp kết quả kiểm thử  
- **Tổng số test case**: 7  
- **Số test case đạt**: 7  
- **Số test case không đạt**: 0  
- **Tỷ lệ thành công**: 100%

---

## 5. Kết luận  
Chương trình tính tổng hai số nguyên đã hoạt động đúng như mong đợi trong tất cả các trường hợp kiểm thử. Tất cả các test case đều thành công, bao gồm các trường hợp kiểm thử số dương, âm, 0, và các trường hợp đặc biệt như đầu vào là `null` hoặc kiểu dữ liệu không hợp lệ. Chương trình hiện tại đáp ứng yêu cầu và đảm bảo tính đúng đắn của phương thức tính tổng.

## 6.Cải tiến:
- **Chương trình trước khi cải tiến bằng chat gpt**: 7/10
- **Chương trình sau khi cải tiến bằng chat gpt**: 8,7/10


![Ảnh chụp màn hình 2025-01-06 105714](https://github.com/user-attachments/assets/95b60cfb-adf0-45d6-83a0-570956718e50)

