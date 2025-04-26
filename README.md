วิธีการรัน

1. Run code ก่อนในไหนก้ได้ มันจะ default ที่ port 8080

2. เปิด PostMan ใน desktop กรณี run local

3. ใส่ http://localhost:8080

4. ตอนแรกต้องสร้างโดยใช้ Post ก่อนให้ใส่ http://localhost:8080/users และ Body เป็น

{
  "name": "Leanne Graham",
  "username": "Bret",
  "email": "Sincere@april.biz",
  "address": {
    "street": "Kulas Light",
    "suite": "Apt. 556",
    "city": "Gwenborough",
    "zipcode": "92998-3874",
    "geo": {
      "lat": "-37.3159",
      "lng": "81.1496"
    }
  },
  "phone": "1-770-736-8031 x5644",
  "website": "hildegard.org",
  "company": {
    "name": "Romaguera-Crona",
    "catchPhrase": "Multi-layered client-server neural-net",
    "bs": "harness real-time e-markets"
  }
}
5. พอมันขึ้นว่า created หรือ status 201 แล้วให้เช็ค Get  http://localhost:8080/users ดู ID จะขึ้นเป็น 1

ุ6. ลอง แก้ไขด้วย Put แต่ต้องระบุ ID เช่น  http://localhost:8080/users/1 แล้วให้แก้ไขข้อความใน Body

7. ลอง Deleted แล้ว Get ใหม่อีกรอบ จะขึ้นเป็น Array ว่าง

*หมายเหตุ* ID จะรันไปเรื่อยๆ เพราะใช้ ID++ ทำให้เวลาdelete ID:1 สร้างใหม่มันจะกลายเป็น 2 อัตโนมัต 
