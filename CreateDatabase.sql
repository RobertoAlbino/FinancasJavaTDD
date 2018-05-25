CREATE DATABASE FINANCAS;
CREATE TABLE USUARIO (ID INT PRIMARY KEY AUTO_INCREMENT, LOGIN VARCHAR(100) NOT NULL, EMAIL VARCHAR(100) NOT NULL, SENHA VARCHAR(100) NOT NULL);
CREATE TABLE TIPO_RECEITA  (ID INT PRIMARY KEY AUTO_INCREMENT, 
                            DESCRICAO VARCHAR(100) NOT NULL, 
                            ID_USUARIO INT NOT NULL,
                            CONSTRAINT FK_USUARIO_TIPO_RECEITA FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID));                      
CREATE TABLE TIPO_DESPESA  (ID INT PRIMARY KEY AUTO_INCREMENT, 
                            DESCRICAO VARCHAR(100) NOT NULL, 
                            ID_USUARIO INT NOT NULL,
                            CONSTRAINT FK_USUARIO_TIPO_DESPESA FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID));
CREATE TABLE RECEITA (ID INT PRIMARY KEY AUTO_INCREMENT,
                      DATA_RECEITA DATE NOT NULL,
                      VALOR DOUBLE NOT NULL,
                      MODO_PAGAMENTO VARCHAR(30) NOT NULL,
                      ID_USUARIO INT NOT NULL,
                      ID_TIPO_RECEITA INT NOT NULL,
                      CONSTRAINT FK_USUARIO_RECEITA FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID),
                      CONSTRAINT FK_TIPO_RECEITA FOREIGN KEY (ID_TIPO_RECEITA) REFERENCES TIPO_RECEITA(ID));
CREATE TABLE DESPESA (ID INT PRIMARY KEY AUTO_INCREMENT,
                      DATA_DESPESA DATE NOT NULL,
                      VALOR DOUBLE NOT NULL,
                      MODO_PAGAMENTO INT NOT NULL,
                      ID_USUARIO INT NOT NULL,
                      ID_TIPO_DESPESA INT NOT NULL,
                      CONSTRAINT FK_USUARIO_DESPESA FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID),
                      CONSTRAINT FK_TIPO_DESPESA FOREIGN KEY (ID_TIPO_DESPESA) REFERENCES TIPO_DESPESA(ID));                      
CREATE TABLE TOTALIZADORES (ID INT PRIMARY KEY AUTO_INCREMENT, 
                            TOTAL_RECEITA DOUBLE NOT NULL, 
                            TOTAL_DESPESA DOUBLE NOT NULL,
                            ID_USUARIO INT NOT NULL,
                            CONSTRAINT FK_USUARIO FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID));