- Hoàng Văn Nhã K58-CC 13020311

- Bài toán tìm giá trị lớn nhất trong các List số int


- Chọn phuong pháp kiểmm thử biên và biên mình
	+ Phuong pháp: nếu a<= y <= b thì chọn các ca test: a, a+1, a+b/2, b-1, b
	+ Kiểm thử mình thì chọn thêm 2 ca test với a-1 và b +1 d? kiểm tra truờng hợp xấu nhất
	+ Phương pháp này là phù hợp nhất là vì: dây là phuong pháp dễ dàng, dễ thực hiện, tạo dược các test, tự động
	+ Chỉ việc sử dụng các kiến thức co bản với hàm  xác định miềnn giá trị từ dó xác dịnh các ca kiểm thử
	+ Phuong pháp này hiệu quả với  chuong trình này vì các giá trị đầu vào là độc lập và biểu diên các giá trị vật lý là bị chặn
	
- kết quả: 
	+ Từ kết quả test thấy được chương trình còn nhiều lỗi
	+ Ví dụ: Chưa xử lý các giá trị ngoại lệ
	+ Giúp cải thiện chương trình