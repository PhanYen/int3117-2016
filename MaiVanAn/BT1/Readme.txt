Mai Văn An - 13020001
Nâng cấp BT tuần 1:
- Sử dụng Kiểm thử biên mạnh : 
	+ Do hàm tính tổng các số chẵn dương nhỏ hơn số n cho trước nên tăng giá trị biên max.
	+ Biên Mix cho giá trị -10000 với expect result = 0
	
- Khi cho max = 100000 thì kết quả ra âm. Lí do: Kiểu trả về của KQ là int.
- Sửa lại kiểu trả về là long.