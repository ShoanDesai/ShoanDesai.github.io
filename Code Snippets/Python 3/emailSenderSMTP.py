import smtplib

for element in range ( 0 , 10 ) : 
    subject = "HELLO THERE" + str ( element ) 
    body = "Hi Adam ,\n\nDo not sms me again\n\n This is just the beginning" 
    message = f 'Subject: { subject } \n\n { body } ' print ( "Starting to send Email..." ) 
    with smtplib.SMTP_SSL ( 'smtp.gmail.com' , 465 ) as server : 
        server.login ( "adamsmsgateway@gmail.com" , "V@lidPassword123" )
        reciever =  "als29192@gmail.com"
        server.sendmail ( "adamsmsgateway@gmail.com" , reciever, message ) 
        print ( "Email Sent" )