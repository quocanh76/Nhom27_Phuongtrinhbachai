# Giải Phương Trình Bậc 2

## Giới Thiệu
Ứng dụng Android giải phương trình bậc 2 dưới dạng:  
**ax² + bx + c = 0**  

Người dùng nhập các hệ số a, b, c và nhận được kết quả nghiệm của phương trình.

## Cấu Trúc
Bao gồm hai màn hình chính:  

1. **MainActivity**:  
   - Giao diện nhập hệ số a, b, c.  
   - Nút bấm để chuyển sang màn hình kết quả.  

2. **SecondActivity**:  
   - Nhận dữ liệu từ `MainActivity`.  
   - Tính toán nghiệm của phương trình bậc 2.  
   - Hiển thị kết quả.  
   - Nút "Clear" để xóa kết quả.  
   - Nút "Back" để quay về `MainActivity`.

## Tệp Chính
- `MainActivity.java`  
  - Nhận dữ liệu đầu vào từ người dùng.  
  - Chuyển dữ liệu sang `SecondActivity`.  

- `SecondActivity.java`  
  - Nhận dữ liệu, tính toán nghiệm, hiển thị kết quả.  
  - Cung cấp chức năng xóa kết quả và quay lại màn hình chính.  

- `activity_main.xml`  
  - Giao diện nhập hệ số a, b, c.  
  - Nút chuyển sang màn hình kết quả.  

- `second_activity.xml`  
  - Giao diện hiển thị nghiệm của phương trình.  
  - Nút "Clear" và "Back".
## Giao diện
![image](https://github.com/user-attachments/assets/e2c6060b-3045-495a-ae4d-e3faf5502d5e)  ![image](https://github.com/user-attachments/assets/49af3b91-7843-4b3b-af8b-18af08bffd99)
<br>
## Cách Sử Dụng
1. Nhập giá trị `a`, `b`, `c` vào ô nhập liệu.  
2. Nhấn nút **"Giải phương trình"** để chuyển sang màn hình kết quả.  
3. Xem nghiệm của phương trình hiển thị trên màn hình.  
4. Nhấn **"Clear"** để xóa kết quả hoặc **"Back"** để quay về màn hình chính.
## Giao diện
![image](https://github.com/user-attachments/assets/a16ebe48-7ae9-4b5c-83ca-c45557b0d7b9)  ![image](https://github.com/user-attachments/assets/2724b8ff-fad6-436c-b326-3db8cbcd5a03)
<br>
## Tác Giả
Ứng dụng được phát triển bởi:
**Nhóm 27**
**21200026 - Nguyễn Trường An**
**21200027 - Hà Quốc Anh**.  
