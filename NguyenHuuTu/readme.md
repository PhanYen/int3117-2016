Bài toán: Tìm ước chung lớn nhất UCLN của 2 số
phương thức: UCLN(a,b);

Phương pháp kiểm thử: Lớp tương đương

Phân thành các lớp và các testcase:
- cận dưới: a=0, b=0;
- cận trên: a=32767, b=32767;
- giá trị 1: a=1, b=327;
- số nguyên tố: a=13, b=29;
- một cặp bất kì: a=100, b=80;
- giá trị âm a=-10, b=-100;

Chọn phương pháp Lớp tương đương, thì chúng ta có thể kiểm soát các giá trị nhập vào, giá trị đặc biệt, tức là trong đó nó đã bao gồm phương pháp biên
Bài toán này với kiểu dữ liệu int chúng ta có thể xử lí các giá trị từ 0->32767