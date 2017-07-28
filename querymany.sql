-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: querymany
-- ------------------------------------------------------
-- Server version	5.7.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `bkid` int(11) NOT NULL AUTO_INCREMENT,
  `bkname` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `tid` int(11) DEFAULT NULL,
  PRIMARY KEY (`bkid`),
  KEY `book_fk_type` (`tid`),
  CONSTRAINT `book_fk_type` FOREIGN KEY (`tid`) REFERENCES `type` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'完美世界','辰东',3),(2,'斗破苍穹','天蚕土豆',3),(3,'校花的贴身高手','鱼人二代',1),(4,'盗墓笔记','南派三叔',2),(5,'凡人修仙传','忘语',7),(6,'诛仙','萧鼎',7),(7,'将夜','猫腻',3),(8,'步步惊心','桐华',4),(9,'琅琊榜','海宴',4),(10,'异界之屠龙传奇','吴三胖子',5),(11,'天龙八部','金庸',8),(12,'狼牙','刘猛',10),(13,'从零开始','雷云风暴',9),(14,'飞升之后','黄埔奇',3),(15,'我是一本书','我是一个作者',NULL);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `comid` int(11) NOT NULL AUTO_INCREMENT,
  `content` text NOT NULL,
  `bkid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `datetime` datetime NOT NULL,
  PRIMARY KEY (`comid`),
  KEY `comment_fk_bkid` (`bkid`),
  KEY `comment_fk_uid` (`uid`),
  CONSTRAINT `comment_fk_bkid` FOREIGN KEY (`bkid`) REFERENCES `book` (`bkid`),
  CONSTRAINT `comment_fk_uid` FOREIGN KEY (`uid`) REFERENCES `hw_user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (19,'这完美世界本书写的太好啦.',1,3,'2000-01-01 19:00:00'),(20,'天蚕土豆我要给你生土豆.',2,11,'2011-06-04 21:03:10'),(21,'天蚕土豆我要给你生土豆+1.',2,11,'2011-06-04 21:03:11'),(22,'天蚕土豆我要给你生土豆+2.',2,11,'2011-06-04 21:03:12'),(23,'天蚕土豆我要给你生土豆+3.',2,11,'2011-06-04 21:03:13'),(24,'你拿什么给他生?.',2,13,'2011-06-04 22:05:23'),(25,'强推飞升之后!.',14,3,'2013-09-14 02:15:33'),(26,'这是我看过的一本印象很深刻的军事小说!.',12,8,'2016-03-14 12:25:03'),(27,'写的不错,在追!.',7,7,'2016-03-14 12:25:03'),(28,'确实写的不错,我也在追!.',7,6,'2016-03-14 12:26:13'),(29,'哎这风云无忌怎么这么傻!.',14,9,'2013-03-17 14:36:19'),(30,'其实我还是比较喜欢迟伤的!.',14,10,'2018-05-22 00:36:00'),(31,'迟伤三扣谢恩师的时候都快给我看哭了!.',14,5,'2012-12-22 03:46:03'),(32,'还生土豆,小白文一个!.',2,5,'2011-07-22 13:41:13'),(33,'萧炎个烧饼!.',2,5,'2011-07-22 13:42:30'),(34,'不亏是金老师,经典就是经典!.',11,5,'2009-12-12 20:12:31'),(35,'诛仙真是经典啊!.',6,2,'2012-12-12 12:12:12');
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hw_user`
--

DROP TABLE IF EXISTS `hw_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hw_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` char(60) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `loc` char(50) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hw_user`
--

LOCK TABLES `hw_user` WRITE;
/*!40000 ALTER TABLE `hw_user` DISABLE KEYS */;
INSERT INTO `hw_user` VALUES (1,'李小龙',51,'北京'),(2,'张家辉',52,'上海'),(3,'周润发',62,'广州'),(4,'梁家辉',63,'深圳'),(5,'刘青云',48,'沈阳'),(6,'古天乐',39,'杭州'),(7,'张丰毅',28,'杭州'),(8,'梁朝伟',46,'北京'),(9,'陈道明',58,'北京'),(10,'张国荣',47,'香港'),(11,'黄渤',27,'北京'),(12,'吴镇宇',38,'香港'),(13,'周星驰',38,'香港'),(15,'赵本山',18,'铁岭'),(16,'小沈阳',18,'铁岭'),(17,'赵本山',18,'铁岭'),(18,'赵本山',18,'铁岭'),(19,'赵本山',18,'铁岭'),(20,'赵本山',18,'铁岭'),(21,'赵本山',18,'铁岭'),(22,'赵本山',18,'铁岭'),(25,'宋小宝',18,'沈阳'),(26,'刘小光',22,'北京'),(28,'宫本武藏',20,'上海');
/*!40000 ALTER TABLE `hw_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type`
--

DROP TABLE IF EXISTS `type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(50) NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type`
--

LOCK TABLES `type` WRITE;
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
INSERT INTO `type` VALUES (1,'言情'),(2,'恐怖'),(3,'玄幻'),(4,'穿越'),(5,'异界'),(6,'校园'),(7,'仙侠'),(8,'武侠'),(9,'网游'),(10,'军事');
/*!40000 ALTER TABLE `type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `u_coll_bk`
--

DROP TABLE IF EXISTS `u_coll_bk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `u_coll_bk` (
  `uid` int(11) DEFAULT NULL,
  `bkid` int(11) DEFAULT NULL,
  UNIQUE KEY `uk_ucb` (`uid`,`bkid`),
  KEY `u_coll_bkid_fk_bkid` (`bkid`),
  CONSTRAINT `u_coll_bkid_fk_bkid` FOREIGN KEY (`bkid`) REFERENCES `book` (`bkid`),
  CONSTRAINT `u_coll_bkid_fk_uid` FOREIGN KEY (`uid`) REFERENCES `hw_user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `u_coll_bk`
--

LOCK TABLES `u_coll_bk` WRITE;
/*!40000 ALTER TABLE `u_coll_bk` DISABLE KEYS */;
INSERT INTO `u_coll_bk` VALUES (1,2),(1,5),(1,9),(1,14),(2,6),(2,9),(2,11),(2,13),(2,14),(3,1),(4,5),(4,14),(5,2),(5,3),(5,14),(6,7),(7,1),(7,2),(7,3),(7,5),(7,7),(7,9),(7,11),(7,14),(8,14),(9,14),(13,14);
/*!40000 ALTER TABLE `u_coll_bk` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-21 17:22:18
