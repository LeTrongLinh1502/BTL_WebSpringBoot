# BTL_WebSpringBoot
# Blog truyện Anime
## Mô tả hệ thống
### Khái quát về hệ thống
Hệ thống gồm 3 phần:
- Front End: sử dụng HTML,CSS,JS
- Back End: Spring DATA JPA 
- Cơ sở dữ liệu: MySQL
### Các chức năng của hệ thống
#### Phía người dùng(user-có tài khoản)
  - [x] Hiển thị các bài viết của Blog
  - [x] Đăng các bài viết và sửa,xóa bài viết của mình
  - [x] Bình luận được tất cả các bài viết
#### Phía admin
  - [x] Quản lý các bài viết ( Thêm, xóa) 
  - [x] Quản lý các user (Sửa, Xóa)  
  - [x] Tìm kiếm bài viết 
  - [x] Tìm kiếm user
 #### Phía khách(Không có tài khoản)
  - [x] Hiển thị các bài viết của Blog
### Các phần mềm và công nghệ sử dụng
#### Các phần mềm sử dụng
-  **Spring Tool Suite 4**: Spring Tool Suite (STS) là một công cụ đắc lực cho các lập trình viên khi làm việc với Spring framework. Với Spring Boot, nó cũng không phải là ngoại lệ. Để hỗ trợ cho Spring Boot, STS đã tích hợp với Spring Initializr giúp chúng ta có thể dễ dàng bắt đầu làm việc với Spring Boot. 
-   **MySQL**:MySQL là một hệ thống quản trị cơ sở dữ liệu mã nguồn mở (gọi tắt là RDBMS) hoạt động theo mô hình client-server. Với RDBMS là viết tắt của Relational Database Management System.
#### Java framework sử dụng
-  **Spring Boot**:để khởi tạo và chạy dự án
-  **Spring Security**:để mã hóa mật khẩu và xác thực người dùng
-  **Spring MVC**:để xây dựng Blog
-  **Spring DATA**:để thao tác với cơ sở dữ liệu, cụ thể sẽ dùng Spring Data JPA - một thành viên trong gia đình Spring Data
#### Các công nghệ sử dụng
- **HTML**
- **CSS**
- **Javascript**
- **Spring DATA JPA**
- **Java Application Servers**
- **HTTP: Hypertext Transfer Protocol**
## Cơ Sở dữ liệu 
![image](https://user-images.githubusercontent.com/91041371/171356444-10b403cf-e76d-4a73-acba-8ba119c7c933.png)
## Thiết kế các chức năng
#### Phía Admin
**Chức năng quản lý các bài viết**:id,title,author,category,craeted date<br>
![image](https://user-images.githubusercontent.com/91041371/171398990-1021d8ff-8b51-4d60-bcea-0ded8dc6acc9.png)

**Chức năng thêm bài viết** <br>
![image](https://user-images.githubusercontent.com/91041371/171363362-91a43476-e73d-4087-b528-b156650fe16c.png)
**Chức năng quản lý các user** <br>
-Danh sách các user:username,passwword,lastname,firstname,nickname,email,rights
![image](https://user-images.githubusercontent.com/91041371/171363921-4dc40426-f10e-4ff6-a52d-62b41c634c0f.png)
-Sửa thông tin user
![image](https://user-images.githubusercontent.com/91041371/171364493-fb3884e1-a0be-4f47-b501-7b6372573db4.png)
-Xóa user
![image](https://user-images.githubusercontent.com/91041371/171364606-a2c5e1b5-b906-4d76-b0dd-8bafaae71f62.png)
### Chức năng và giao diện
#### Phía Client(có tài khoản)
**GIAO DIỆN TRANG CHỦ** bao gồm danh sách các bài viết của blog
![image](https://user-images.githubusercontent.com/91041371/171380476-53062c0b-e65b-4d5e-a1dc-3503e6cada8e.png)
**GIAO DIỆN ĐĂNG NHẬP** 
![image](https://user-images.githubusercontent.com/91041371/171366453-0d941381-773f-43ce-a512-b861228e39dc.png)
**GIAO DIỆN ĐĂNG KÝ** 
![image](https://user-images.githubusercontent.com/91041371/171366576-59860c12-5f00-4c70-b58d-e3819f474d11.png)
**Chức năng thêm bài viết** <br>
![image](https://user-images.githubusercontent.com/91041371/171368152-322fc9a7-2ce9-46fb-aa8b-bbcb00245b3a.png)
-Click vào Send
![image](https://user-images.githubusercontent.com/91041371/171368249-ca0e6ccc-e303-4677-8fa5-e9c1d239b237.png)

**Chức năng sửa/xóa bài viết**
![image](https://user-images.githubusercontent.com/91041371/171399385-4d4af7b8-acb2-4478-808f-bcb421b1cd44.png)

-Click vào Edit
![image](https://user-images.githubusercontent.com/91041371/171399511-749fa6a4-a16b-4ac4-91c3-e904fbb68384.png)
**Chức năng comment bài viết**
![image](https://user-images.githubusercontent.com/91041371/171399770-39e747c3-77e5-4a28-bc02-e8da6a8f980d.png)
-click vào Comment Post
![image](https://user-images.githubusercontent.com/91041371/171399857-0a91a9ad-dc39-47ba-8dbc-6662229ea9d8.png)
-Click vào Send để comment
![image](https://user-images.githubusercontent.com/91041371/171399903-1e67936b-092e-4716-988c-578b460d1113.png)
#### Phía Client(không có tài khoản)
-Chỉ được xem các bài viết
![image](https://user-images.githubusercontent.com/91041371/171380731-7d081dbc-14b9-4e40-b4e6-a00863d84a01.png)

## Phân công công việc
- Lê Trọng Linh-leader:
  - Lên kịch bản chi tiết từng chức năng(vai trò như một designer):Tạo cấu trúc Source Code(các package,các file,các hàm cần sử dụng...)
  - Tạo CSDL
  - Trang quản lý của Admin(có các chức năng :thêm,xóa bài viết; thêm,sửa,xóa:user;tìm kiếm: bài viết,user)
  - Chức năng đăng nhập ,đăng ký trên giao diện tương tác với Client
  - Phân quyền đối với các tài khoản đăng nhập(ROLE_ADMIN, ROLE_USER ,ROLE_ANONYMOUS)
  - Hướng dẫn chi tiết các thành viên trong team làm các chức năng còn lại trên giao diện thao tác với Client
- Nguyễn Mạnh Tùng
  - Chức năng thêm các bài viết trong Blog
  - Chức năng comment các bài viết trong Blog
- Nguyễn Đức Minh
  - Chức năng xóa/ sửa bài viết trong Blog
  - Hiển thị thông tin các bài viết của Blog
  
