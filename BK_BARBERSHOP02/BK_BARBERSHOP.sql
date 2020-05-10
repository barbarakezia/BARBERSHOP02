-- MySQL dump 10.16  Distrib 10.1.37-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: bk_barbershop
-- ------------------------------------------------------
-- Server version	10.1.37-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `BK_Agendamento`
--

DROP TABLE IF EXISTS `BK_Agendamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BK_Agendamento` (
  `id` int(11) DEFAULT NULL,
  `cliente` varchar(255) DEFAULT NULL,
  `servico` varchar(255) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `data` date DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BK_Agendamento`
--

LOCK TABLES `BK_Agendamento` WRITE;
/*!40000 ALTER TABLE `BK_Agendamento` DISABLE KEYS */;
INSERT INTO `BK_Agendamento` VALUES (1,'Lucas Batista Pinheiro','corte degrade',15,'0000-00-00','pagamento a vista'),(2,'Anthony Davi De Souza Brandao','corte social',20,'0000-00-00','pagamento cartao de credito'),(3,'Arnold Brito Gomes','corte militar',10,'2020-03-26','pagamento a vista'),(4,'Alison Ribeiro Paixao','corte moicano',20,'2020-04-01','pagamento a vista'),(5,'Marcelo De Moraes Souza','barba',12,'2020-04-03','fiado');
/*!40000 ALTER TABLE `BK_Agendamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BK_Cliente`
--

DROP TABLE IF EXISTS `BK_Cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BK_Cliente` (
  `id` int(11) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `cep` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BK_Cliente`
--

LOCK TABLES `BK_Cliente` WRITE;
/*!40000 ALTER TABLE `BK_Cliente` DISABLE KEYS */;
INSERT INTO `BK_Cliente` VALUES (1,'Avenida das nacoes',68928009),(2,'Avenida Princesa Isabel',68928007),(3,'Avenida José De Anchieta',68928006),(4,'Rua Deodoro Da Fonseca',68928005),(5,'Rua Tancredo Neves',68928004);
/*!40000 ALTER TABLE `BK_Cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BK_Pessoa`
--

DROP TABLE IF EXISTS `BK_Pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BK_Pessoa` (
  `id` int(11) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `rg` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BK_Pessoa`
--

LOCK TABLES `BK_Pessoa` WRITE;
/*!40000 ALTER TABLE `BK_Pessoa` DISABLE KEYS */;
INSERT INTO `BK_Pessoa` VALUES (1,'Lucas Batista Pinheiro','M','1998-05-03','96991445826','lucasp25@gmail.com','364985'),(2,'Anthony Davi De Souza Brandao ','M','1999-01-12','96991445927','anthonydavi26@gmail.com','365086'),(3,'Arnold Brito Gomes ','M','1989-07-10','96991446037','arnoldbgomes27@gmail.com','366087'),(4,'Alison Ribeiro Paixao ','M','2000-11-01','96991446639','alissonribeiroo28@gmail.com','366590'),(5,'Marcelo De Moraes Souza ','M','1999-08-04','96991487924','mdemoaresr30@gmail.com','369416'),(1,'Lucas Batista Pinheiro','M','0000-00-00','96991445836','anthonydavip26@gmail.com','364975');
/*!40000 ALTER TABLE `BK_Pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BK_Servico`
--

DROP TABLE IF EXISTS `BK_Servico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BK_Servico` (
  `id` int(11) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `valor` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BK_Servico`
--

LOCK TABLES `BK_Servico` WRITE;
/*!40000 ALTER TABLE `BK_Servico` DISABLE KEYS */;
INSERT INTO `BK_Servico` VALUES (1,'corte degrade',15),(2,'corte social',20),(3,'corte militar',10),(4,'corte moicano',20),(5,'barba',12);
/*!40000 ALTER TABLE `BK_Servico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BK_Usuario`
--

DROP TABLE IF EXISTS `BK_Usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BK_Usuario` (
  `id` int(11) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `nivelacesso` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BK_Usuario`
--

LOCK TABLES `BK_Usuario` WRITE;
/*!40000 ALTER TABLE `BK_Usuario` DISABLE KEYS */;
INSERT INTO `BK_Usuario` VALUES (6,'050403','proprietario'),(7,'040302','caixa'),(8,'030201','assistente'),(9,'030211','barbeiro'),(10,'030223','recepicionista');
/*!40000 ALTER TABLE `BK_Usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-06 19:17:28
