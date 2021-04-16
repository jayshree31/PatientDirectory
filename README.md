# PatientDirectory
For assignment

For Database use below Quries:
CREATE DATABASE  IF NOT EXISTS `patient_directory`;
USE `patient_directory`;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `full_name` varchar(200) DEFAULT NULL,
  `Gender` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `patient`
--

INSERT INTO `employee` VALUES 
	(1,'Raju','Andrews','leslie@luv2code.com'),
	(2,'Emma','Jadhav','emma@luv2code.com'),
	(3,'Avani','Gupta','avani@luv2code.com'),
	(4,'Yuri','Petrov','yuri@luv2code.com'),
	(5,'Juan','Vega','juan@luv2code.com');

Select * from patient
