# BTL_WebSpringBoot
# Blog truyện Anime
## Mô tả hệ thống
### Khái quát về hệ thống
Hệ thống gồm 3 phần:
- Front End: được viết bằng NextJs bao gồm 2 phần Client và Admin
- Back End: Spring REST API 
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
- **NextJS**: NextJS cũng là một React Framework dựa trên ReactJS. 
ReactJS là một thư viện  JavaScript chuyên giúp các nhà phát triển xây dựng giao diện người dùng hay UI một cách dễ dàng và nhanh hơn.
Bằng cách cung cấp cho chúng ta khả năng Reusable Code  (tái sử dụng code) 
giúp tăng tốc quá trình phát triển và giảm thiểu những rủi ro có thể xảy ra trong quá trình phát triển ứng dụng. 
Vậy tại sao lại chọn sử dụng NextJS cho ứng dụng này: 
  - Là web đặt vé chiếu phim, cho nên thông tin các bộ phim luôn cần được hiển thị trên site và cần được tối ưu SEO (Search engine optimization), 
  do ReactJS là một library chỉ hỗ trợ Client-side Rendering (thông tin về phim chỉ được lấy sau khi page được người dùng load website)
  nên việc tối ưu SEO sẽ không được tốt bằng Server-side Rendering (thông tin về phim sẽ được render sẵn khi người dùng request đến server).
   NextJS có hỗ trợ sẵn Sever-side Rendering và Static Generation để đảm bảo hiệu năng tốt nhất.
  - Thông tin các bộ phim luôn bao gồm các ảnh có dung lượng lớn và cần tối ưu cho các màn hình nhỏ hơn, NextJS có sẵn component Image giúp resize ảnh tuỳ theo size màn hình giúp website load tài nguyên nhanh hơn.
- **Firebase**: firebase là một nền tảng để phát triển ứng dụng di động và trang web, bao gồm các dịch vụ cơ sở dữ liệu hoạt động trên nền tảng đám mây. Chức năng chính là giúp người dùng lập trinh ứng dụng bằng cách đơn giản hoá các thao tác với cơ sở dữ liệu. Trong website này, firebase hoạt động như một backend services, bao gồm một cơ sở dữ liệu chính, storage để lưu các file ảnh, … Mọi thao tác với cơ sở dữ liệu đều thông qua firebase.
- Ngoài ra trong Front End còn có sử dụng **Tailwind CSS** và **TypeScript**
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
**Sửa thông tin phim**
![image](https://user-images.githubusercontent.com/88889991/170670909-e79f67b1-f23a-48bc-91b2-30bc83552f48.png)
![image](https://user-images.githubusercontent.com/88889991/170670968-eb5ec269-8d7f-4b85-9539-92e60833659f.png)
![image](https://user-images.githubusercontent.com/88889991/170671054-e3ba2441-ba2f-4f9b-b447-a9c48bc9a3b8.png)
Dữ liệu của phim đã được sửa<br>
**Thêm lịch chiếu** hệ thống sẽ kiểm tra lịch chiếu mới có bị trùng với lịch chiếu sẵn có trong phòng chiếu được thêm không, nếu có thì sẽ thêm còn không thì sẽ thông báo để chọn lại
![image](https://user-images.githubusercontent.com/88889991/170671237-4372dcc9-4dd6-4fb7-9b8a-bd7e7c2289a4.png)
### Các thông tin cần quản lý
- Khách hàng (user): họ tên, email, số điện thoại, địa chỉ
- Phim (movies): Mã phim, tên phim, ngày ra rạp, thời lượng, trạng thái ( Chưa chiếu/ Đang chiếu/ Không chiếu), thể loại, giới hạn độ tuổi, ảnh poster, ảnh trailer.
- Rạp chiếu(cinemas): tên rạp chiếu, địa chỉ, khu vực, vị trí, các phòng chiếu(Thông tin các ghế)
- Các loại ghế(seatType): id, tên loại, giá
- Thông tin phòng theo suất chiếu (roomShift): Thông tin phòng chiếu, số ghế 1 hàng, thông tin các ghế ( Đã đặt/ chưa đặt)
- Lịch chiếu theo phim (Schedule): thông tin thời gian chiếu, rạp chiếu, phòng chiếu, phim chiếu ( Dùng cho bên client để khách hàng đặt vé)
- Lịch chiếu theo phòng(ScheduleByRoom): Thông tin rạp và phòng, thời gian bắt đầu và kết thúc ( Dùng cho bên Admin để khi thêm lịch không xảy ra trùng giờ)
- Định dạng phim (showType): id và tên định dạng


### Chức năng và giao diện
#### Phía Client(có tài khoản)
**GIAO DIỆN TRANG CHỦ** bao gồm danh sách các bài viết của blog
![image](https://user-images.githubusercontent.com/88889991/170665645-08d056b3-3154-43b4-8c62-293b48aa3bff.png)
![image](https://user-images.githubusercontent.com/88889991/170666212-68b782cd-ccaf-4ad3-ba4e-ceca5daa52cd.png)
![image](https://user-images.githubusercontent.com/88889991/170665839-5b8aa934-a5e1-40f5-b2c8-d7206dd5d23f.png)
Chọn một phim bất kì và web sẽ chuyển sang trang **GIAO DIỆN CHI TIẾT**
![image](https://user-images.githubusercontent.com/88889991/170666872-b404f1b9-fc80-453a-bc5f-d50ee7aa0780.png) <br>
**GIAO DIỆN ĐĂNG KÝ/ĐĂNG NHẬP** Trong giao diện này có thể đăng kí thủ công hoặc đăng nhập nhanh bằng cách dùng tài khoảng Facebook hoặc Google
![image](https://user-images.githubusercontent.com/88889991/170668904-00660332-0d16-4aa8-a44e-820dfcdab09e.png)

**Chức năng xem lịch chiếu** <br>
![image](https://user-images.githubusercontent.com/88889991/170731148-e61f8b45-0579-40c2-a32a-12d9fcb468f8.png)

**Chức năng đặt ghế**



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
  
