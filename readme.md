# require  ก่อนรัน 
1. เครื่องมี docker , docker-compose 
  > https://docs.docker.com/engine/install/ubuntu/ 
  > https://docs.docker.com/compose/install/

# how to run  (เครื่่องต้องมีเน็ตก่อน) 
0. ให้ cd เข้าไปใน folder demo ก่อน
1. รัน start.sh หรือจะ ก้อบทีละคำสั่งในนั้นไปรันก็ได้
2. แก้ไขโปรแกรมเสร็จก็ไปสั่ง start.sh ใหม่ 

# อย่าลืม
3. ใช้เสร็จอย่าลืมปิดด้วยคำสั่ง docker-compose down 


# ทดสอบ get all
http://localhost:9080/api/register-patient/find-all 

# ทดสอบ create เข้า postman แล้วลองยิงแบบ post ไป http://localhost:9080/api/register-patient/create ดู  
# เอา body ที่ให้ไว้ ประมาณนี้
{
  "idRegisterPatient": "1",
  "fristnameLastname": "john nonphala",
  "idCard": "23411-00024-4",
  "birthday": "28/11/2540",
  "address": "30/2",
  "phone": "093500"
}