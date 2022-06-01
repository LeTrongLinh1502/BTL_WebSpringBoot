# BTL_WebSpringBoot
# Blog truyện Anime
## Mô tả hệ thống
### Khái quát về hệ thống
Hệ thống gồm 3 phần:
- Front End: sử dụng HTML,CSS,JS,Bootstrap
- Back End: Spring DATA JPA 
- Cơ sở dữ liệu: MySQL
### Các chức năng của hệ thống
#### Phía người dùng(user-có tài khoản)
  - [x] Hiển thị các bài viết của Blog
  - [x] Đăng các bài viết và sửa,xóa bài viết của mình
  - [x] Bình luận được tất cả các bài viết
#### Phía admin
  - [x] Quản lý các bài viết ( Thêm, xóa) 
  - [x] Thêm bài viết mới cho Blog 
  - [x] Quản lý các user (Sửa, Xóa)  
 #### Phía khách(Không có tài khoản)
  - [x] Hiển thị các bài viết của Blog
### Các phần mềm và công nghệ sử dụng
#### Các phần mềm sử dụng
-  **Spring Tool Suite 4**: là một trình soạn thảo, biên tập code được phát triển bởi Microsoft, 
VSCode hỗ trợ rất tốt cho khi phát triển ứng dụng web, đặc biệt là các website được phát triển với JavaScript. Sử dụng để code Front End\
#### Java framework sử dụng
-  **Spring Boot**:ể khởi tạo và chạy dự án
-  **Spring Security**:để mã hóa mật khẩu và xác thực người dùng
-  **Spring MVC**:để xây dựng Blog
-  **Spring DATA**:để thao tác với cơ sở dữ liệu, cụ thể sẽ dùng Spring Data JPA - một thành viên trong gia đình Spring Data
#### Các công nghệ sử dụng
- **Spring REST API**
## Cơ Sở dữ liệu 
![image](https://user-images.githubusercontent.com/91041371/171356444-10b403cf-e76d-4a73-acba-8ba119c7c933.png)
## Thiết kế các chức năng
#### Phía Admin
**Chức năng quản lý các bài viết** <br>
![image](https://user-images.githubusercontent.com/91041371/171363787-3a2518d8-6c10-46c2-a143-03465e074fe3.png)
**Chức năng thêm bài viết** <br>
![image](https://user-images.githubusercontent.com/91041371/171363362-91a43476-e73d-4087-b528-b156650fe16c.png)
**Chức năng quản lý các user** <br>
-Danh sách các user:username,passwword,lastname,firstname,nickname,email,rights
![image](https://user-images.githubusercontent.com/91041371/171363921-4dc40426-f10e-4ff6-a52d-62b41c634c0f.png)
-Sửa thông tin user
![image](https://user-images.githubusercontent.com/91041371/171364493-fb3884e1-a0be-4f47-b501-7b6372573db4.png)
-xóa user
![image](https://user-images.githubusercontent.com/91041371/171364606-a2c5e1b5-b906-4d76-b0dd-8bafaae71f62.png)
### Chức năng và giao diện
#### Phía Client(có tài khoản)
**GIAO DIỆN TRANG CHỦ** bao gồm danh sách các bài viết của blog
![image](https://user-images.githubusercontent.com/91041371/171366172-dbdf62d5-7e8b-4891-a71d-7323a5f84919.png)
**GIAO DIỆN ĐĂNG NHẬP** 
![image](https://user-images.githubusercontent.com/91041371/171366453-0d941381-773f-43ce-a512-b861228e39dc.png)
**GIAO DIỆN ĐĂNG KÝ** 
![image](https://user-images.githubusercontent.com/91041371/171366576-59860c12-5f00-4c70-b58d-e3819f474d11.png)
**Chức năng thêm bài viết** <br>
![image](https://user-images.githubusercontent.com/91041371/171368152-322fc9a7-2ce9-46fb-aa8b-bbcb00245b3a.png)
-click vào Send
![image](https://user-images.githubusercontent.com/91041371/171368249-ca0e6ccc-e303-4677-8fa5-e9c1d239b237.png)

**Chức năng sửa/xóa bài viết**
![image](https://user-images.githubusercontent.com/91041371/171366912-a3610766-f54e-416a-b36b-6c5112cbb080.png)
-click vào Edit
![image](https://user-images.githubusercontent.com/91041371/171366985-604eb767-aff8-456e-9742-d9174fea6435.png)
**Chức năng comment bài viết**
![image](https://user-images.githubusercontent.com/91041371/171367158-ce50081d-1dc5-473b-9cac-33483591dbca.png)
-click vào Comment Post
![image](https://user-images.githubusercontent.com/91041371/171367484-8de012b2-2083-4b25-993e-541d382f91e4.png)
-Click vào Send để comment
![image](https://user-images.githubusercontent.com/91041371/171367758-b913ed43-35a2-4faa-8221-af1b31f43870.png)
#### Phía Client(không có tài khoản)
-chỉ được xem các bài viết
![image](https://user-images.githubusercontent.com/91041371/171368664-2dd0172d-1808-4a6f-b824-00b802a070f6.png)

## Phân công công việc
- Lê Trọng Linh-leader:
  - Lên kịch bản chi tiết từng chức năng(vai trò như một designer):Tạo cấu trúc Source Code(các package,các file,các hàm cần sử dụng...)
  - Tạo CSDL
  - Trang quản lý của Admin(có các chức năng :thêm,xóa bài viết; thêm,sửa,xóa:user;tìm kiếm: bài viết,user)
  - Chức năng đăng nhập ,đăng ký trên giao diện tương tác với Client
  - Phân quyền đối với các tài khoản đăng nhập(ROLE_ADMIN, ROLE_USER ,ROLE_ANONYMOUS)
  - Hướng dẫn chi tiết các thành viên trong team làm các chức năng còn lại trên giao diện thao tác với Client
- Nguyễn mạnh Tùng
  - Chức năng thêm các bài viết trong Blog
  - Chức năng comment các bài viết trong Blog
- Nguyễn Đức Minh
  - Chức năng xóa/ sửa bài viết trong Blog
  - Hiển thị thông tin các bài viết
  
