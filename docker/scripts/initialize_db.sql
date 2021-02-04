USE project_meat_chatbot;
CREATE TABLE message (
  id          INT(11)     NOT NULL AUTO_INCREMENT PRIMARY KEY,
  writer      VARCHAR(50),
  content     LONGTEXT,
  created_at  TIMESTAMP
);