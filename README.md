### Báo cáo kiểm thử: Chương trình tính tổng hai số

---

#### 1. Mô tả chương trình  
Chương trình được xây dựng bằng Java Spring Boot với mục đích tính tổng hai số nguyên. Nó bao gồm một hàm chính để tính tổng, cùng với các hàm kiểm thử đơn vị sử dụng JUnit.

---

#### 2. Mô tả code  
- **SumService**: Lớp chính chứa hàm tính tổng.  
- **SumServiceTest**: Lớp kiểm thử đơn vị sử dụng JUnit để kiểm tra tính đúng đắn của hàm tính tổng.

---

#### 3. Kế hoạch kiểm thử  
- **Test 1**: Kiểm tra tổng hai số dương.  
  - **Đầu vào**: `5` và `7`  
  - **Kết quả mong đợi**: `12`  

- **Test 2**: Kiểm tra tổng hai số âm.  
  - **Đầu vào**: `-3` và `-8`  
  - **Kết quả mong đợi**: `-11`  

- **Test 3**: Kiểm tra tổng một số âm và một số dương.  
  - **Đầu vào**: `-5` và `9`  
  - **Kết quả mong đợi**: `4`  

- **Test 4**: Kiểm tra tổng với một số 0.  
  - **Đầu vào**: `0` và `15`  
  - **Kết quả mong đợi**: `15`  
  - **Đầu vào**: `0` và `-10`  
  - **Kết quả mong đợi**: `-10`  

- **Test 5**: Kiểm tra tổng hai số 0.  
  - **Đầu vào**: `0` và `0`  
  - **Kết quả mong đợi**: `0`  

---

#### 4. Tổng hợp kết quả kiểm thử  
- **Tổng số test case**: 5  
- **Số test case đạt**: 5  
- **Số test case không đạt**: 0  
- **Tỷ lệ thành công**: 100%


![Ảnh chụp màn hình 2025-01-06 105714](https://github.com/user-attachments/assets/95b60cfb-adf0-45d6-83a0-570956718e50)

