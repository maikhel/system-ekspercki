--DROP TABLE OBIEKTYWY;

CREATE TABLE OBIEKTYWY (
    "ID" INTEGER not null primary key,
    "PRODUCENT" VARCHAR(15),
    "DOLNA_OGNISKOWA" INTEGER,
    "GORNA_OGNISKOWA" INTEGER,
    "FISHEYE" SMALLINT,
    "USZCZELNIONY" SMALLINT,
    "REDUKCJA_DRGAN" SMALLINT,
    "CENA" DECIMAL,
    "NAZWA" VARCHAR(60)
);

INSERT INTO OBIEKTYWY VALUES
(1,'Pentax',10,17,1,0,0,1875,'DA 10-17mm fish-eye F3.5-4.5 ED (IF)'),
(2,'Pentax',12,24,0,0,0,3599,'DA 12-24mm F4'),
(3,'Pentax',15,15,0,0,0,3499,'HD PENTAX-DA 15mm F4 ED AL Limited'),
(4,'Pentax',15,15,0,0,0,2749,'DA 15mm F4 ED AL Limited'),
(5,'Pentax',16,50,0,1,0,3499,'DA* 16-50mm F2.8 ED AL [IF] SDM'),
(6,'Pentax',17,70,0,0,0,2195,'DA 17-70mm F4 AL (IF) SDM'),
(7,'Pentax',18,50,0,1,0,1069,'HD PENTAX-DA 18-50mm F4-5.6 DC WR RE'),
(8,'Pentax',18,55,0,1,0,369,'DA 18-55mm F3.5-5.6 AL WR'),
(9,'Pentax',18,135,0,1,0,1399,'smc DA 18-135mm F3.5-5.6 ED AL [IF] DC WR'),
(10,'Pentax',18,270,0,0,0,2299,'smc DA18-270mm F3.5-6.3 SDM'),
(11,'Pentax',20,40,0,1,0,2999,'HD PENTAX-DA 20-40mm F2.8-4 ED Limited DC WR'),
(12,'Pentax',21,21,0,0,0,2399,'HD PENTAX-DA 21mm F3.2 AL Limited'),
(13,'Pentax',21,21,0,0,0,2399,'DA 21mm F3.2 AL Limited'),
(14,'Pentax',24,70,0,1,0,5699,'HD PENTAX-D FA 24-70mm F2.8 ED SDM WR'),
(15,'Pentax',31,31,0,0,0,5699,'smc FA 31mm F1.8 AL Limited'),
(16,'Pentax',35,35,0,0,0,2449,'HD PENTAX-DA 35mm F2.8 Macro Limited'),
(17,'Pentax',35,35,0,0,0,1849,'smc DA 35mm F2.4 AL'),
(18,'Pentax',35,35,0,0,0,1899,'DA 35mm F2.8 macro Limited'),
(19,'Pentax',35,35,0,0,0,2399,'smc FA 35mm F2 AL '),
(20,'Pentax',40,40,0,0,0,1190,'DA 40mm F2.8 XS'),
(21,'Pentax',40,40,0,0,0,1685,'HD PENTAX-DA 40mm F2.8 Limited'),
(22,'Pentax',40,40,0,0,0,1699,'DA 40mm F2.8 Limited'),
(23,'Pentax',43,43,0,0,0,3199,'smc FA 43 mm F1.9 Limited'),
(24,'Pentax',50,50,0,0,0,529,'smc DA 50mm F1.8 '),
(25,'Pentax',50,50,0,0,0,1499,'smc FA 50mm F1.4 '),
(26,'Pentax',50,50,0,0,0,1599,'D-FA 50mm F2.8 Macro'),
(27,'Pentax',50,135,0,1,0,4299,'DA* 50-135mm F2.8 ED [IF] SDM'),
(28,'Pentax',50,200,0,1,0,499,'DA 50-200mm F4-5.6 ED WR'),
(29,'Pentax',55,55,0,0,0,2799,'DA* 55mm F1.4 SDM'),
(30,'Pentax',55,300,0,1,0,1449,'HD PENTAX-DA 55-300mm F4-5.8ED WR'),
(31,'Pentax',55,300,0,0,0,1485,'DA 55-300mm F4-5.8 ED'),
(32,'Pentax',60,250,0,1,0,5199,'DA* 60-250mm F4 ED [IF] SDM'),
(33,'Pentax',70,70,0,0,0,2449,'HD PENTAX-DA 70mm F2.4 Limited'),
(34,'Pentax',70,70,0,0,0,2399,'DA 70mm F2.4 Limited'),
(35,'Pentax',77,77,0,0,0,3799,'smc FA 77 mm F1.8 Limited'),
(36,'Pentax',100,100,0,1,0,1999,'D-FA 100mm F2.8 Macro WR'),
(37,'Pentax',200,200,0,1,0,3899,'DA* 200mm F2.8 ED [IF] SDM'),
(38,'Pentax',300,300,0,1,0,4599,'DA* 300mm F4 ED [IF] SDM'),
(39,'Pentax',560,560,0,1,0,21900,'DA 560mm F5.6 ED AW'),
(40,'Sigma',24,70,0,0,0,2799,'Sigma 24-70 F2.8 IF EX DG HSM'),
(41,'Sigma',85,85,0,0,0,3499,'Sigma 85 F1.4 EX DG HSM '),
(42,'Sigma',35,35,0,0,0,3199,'Sigma A 35 F1.4 DG HSM'),
(43,'Sigma',24,105,0,0,1,2999,'Sigma A 24-105 F4 OS DG HSM'),
(44,'Sigma',50,50,0,0,0,3199,'Sigma A 50 F1.4 DG HSM '),
(45,'Sigma',8,16,0,0,0,2990,'Sigma 8-16 F4.5-5.6 DC HSM'),
(46,'Sigma',10,20,0,0,0,1990,'Sigma 10-20 F3.5 EX DC HSM'),
(47,'Sigma',10,20,0,0,0,1490,'Sigma 10-20 F4-5.6 EX DC HSM'),
(48,'Sigma',17,50,0,0,1,1549,'Sigma 17-50 F2.8 EX DC OS HSM'),
(49,'Sigma',17,70,0,0,1,1749,'Sigma 17-70 F2.8-4 DC MACRO OS HSM C'),
(50,'Sigma',18,35,0,0,0,2990,'Sigma A 18-35 F1.8 DC HSM'),
(51,'Sigma',18,200,0,0,1,1599,'Sigma C 18-200 F3.5-6.3 DC MACRO OS HSM'),
(52,'Sigma',18,300,0,0,1,1990,'Sigma C 18-300 F3.5-6.3 DC MACRO OS HSM'),
(53,'Sigma',12,24,0,0,0,3499,'Sigma 12-24 F4.5-5.6 DG HSM II'),
(54,'Sigma',8,8,1,0,0,3299,'Sigma 8 F3.5 EX DG Fisheye'),
(55,'Sigma',15,15,1,0,0,2499,'Sigma 15 F2.8 EX DG Fisheye'),
(56,'Sigma',24,35,0,0,0,4199,'Sigma A 24-35 F2.0 DG HSM'),
(57,'Sigma',50,500,0,0,1,5450,'Sigma 50-500 F4.5-6.3 APO DG OS HSM'),
(58,'Sigma',70,200,0,0,1,3899,'Sigma 70-200 F2.8 APO EX DG OS HSM'),
(59,'Sigma',70,300,0,0,0,599,'Sigma 70-300 F4-5.6 DG MACRO'),
(60,'Sigma',70,300,0,0,0,599,'Sigma 70-300 F4-5.6 APO DG MACRO'),
(61,'Sigma',150,500,0,0,1,3190,'Sigma 150-500 F5-6.3 APO DG OS HSM'),
(62,'Sigma',70,70,0,0,0,1799,'Sigma 70 F2.8 EX DG MACRO'),
(63,'Tamron',18,200,0,0,0,629,'AF 18-200mm F/3.5-6.3 XR Di II LD Aspherical [IF] MACRO'),
(64,'Tamron',10,24,0,0,0,1849,'SP AF 10-24mm F/3.5-4.5 Di II LD Aspherical [IF]'),
(65,'Tamron',17,50,0,0,0,1259,'SP AF 17-50mm F/2.8 XR Di II LD Aspherical [IF]'),
(66,'Tamron',90,90,0,0,0,1669,'SP AF 90mm F/2.8 Di MACRO 1:1'),
(67,'Tamron',18,200,0,0,1,699,'18-200mm F/3.5-6.3 Di II VC '),
(68,'Tamron',15,30,0,0,1,4599,'SP 15-30mm F/2.8 Di VC USD'),
(69,'Tamron',28,300,0,0,1,2999,'28-300mm F/3.5-6.3 Di VC PZD'),
(70,'Tamron',16,300,0,1,1,2289,'16-300mm F/3.5-6.3 Di II VC PZD MACRO'),
(71,'Tamron',18,270,0,0,1,1499,'AF 18-270mm F/3.5 -6.3 Di II VC PZD'),
(72,'Tamron',17,50,0,0,1,1299,'SP AF 17-50mm F/2.8 XR Di II VC LD Aspherical [IF]'),
(73,'Tamron',200,500,0,0,0,3299,'SP AF 200-500mm F/5-6.3 Di LD [IF]'),
(74,'Tamron',150,600,0,0,1,4199,'SP 150-600mm F/5-6.3 Di VC USD'),
(75,'Tamron',24,70,0,0,1,3499,'SP 24-70mm F/2.8 Di VC USD'),
(76,'Tamron',70,300,0,0,0,499,'AF 70-300mm F/4-5.6 Di LD MACRO 1:2'),
(77,'Tamron',28,300,0,0,0,1549,'AF 28-300mm F/3.5-6.3 XR Di LD Aspherical [IF] MACRO'),
(78,'Tamron',90,90,0,0,1,1899,'SP 90mm F/2.8 Di VC USD MACRO 1:1'),
(79,'Tamron',180,180,0,0,0,2999,'SP AF 180mm F/3.5 Di LD[IF] MACRO 1:1'),
(80,'Tamron',70,200,0,0,1,4699,'SP 70-200mm F/2.8 Di VC USD'),
(81,'Tamron',70,300,0,0,1,499,'SP AF 70-300 F/4-5.6 Di VC USD'),
(82,'Canon',10,18,0,0,1,949,'Canon EF-S 10-18mm f/4.5-5.6 IS STM'),
(83,'Canon',10,22,0,0,0,2149,'Canon EF-S 10-22mm f/3.5-4.5 USM '),
(84,'Canon',15,85,0,0,1,2548,'Canon EF-S 15-85mm f/3.5-5.6 IS USM '),
(85,'Canon',17,55,0,0,1,3049,'Canon EF-S 17-55mm f/2.8 IS USM'),
(86,'Canon',17,85,0,0,1,999,'Canon EF-S 17-85mm f/4-5.6 IS USM '),
(87,'Canon',18,55,0,0,1,439,'Canon EF-S 18-55mm f/3.5-5.6 IS STM '),
(88,'Canon',18,55,0,0,1,438,'Canon EF-S 18-55mm f/3.5-5.6 IS II '),
(89,'Canon',18,135,0,0,1,1199,'Canon EF-S 18-135mm f/3.5-5.6 IS STM '),
(90,'Canon',18,200,0,0,1,1929,'Canon EF-S 18-200mm f/3.5-5.6 IS '),
(91,'Canon',55,250,0,0,1,899,'Canon EF-S 55-250mm f/4-5.6 IS STM '),
(92,'Canon',24,24,0,0,0,679,'Canon EF-S 24mm f/2.8 STM'),
(93,'Canon',60,60,0,0,0,1759,'Canon EF-S 60mm f/2.8 Macro USM '),
(94,'Canon',28,28,0,0,0,1790,' Canon EF 28mm f/1.8 USM '),
(95,'Canon',28,28,0,0,1,1899,'Canon EF 28mm f/2.8 IS USM'),
(96,'Canon',14,14,0,0,0,7899,' Canon EF 14mm f/2.8L II USM '),
(97,'Canon',24,24,0,1,0,5999,' Canon EF 24mm f/1.4L II USM '),
(98,'Canon',24,24,0,0,1,2049,' Canon EF 24mm f/2.8 IS USM '),
(99,'Canon',35,35,0,1,0,2099,' Canon EF 35mm f/1.4L II USM '),
(100,'Canon',40,40,0,0,0,749,' Canon EF 40mm f/2.8 STM '),
(101,'Canon',50,50,0,0,0,499,' Canon EF 50mm f/1.8 STM '),
(102,'Canon',50,50,0,0,0,1299,' Canon EF 50mm f/1.4 USM '),
(103,'Canon',50,50,0,0,0,5499,' Canon EF 50mm f/1.2L USM '),
(104,'Canon',85,85,0,0,0,1375,' Canon EF 85mm f/1.8 USM '),
(105,'Canon',85,85,0,0,0,7629,' Canon EF 85mm f/1.2L II USM '),
(106,'Canon',100,100,0,0,0,1849,' Canon EF 100mm f/2 USM '),
(107,'Canon',100,100,0,0,0,1899,'Canon EF 100mm f/2.8 Macro USM'),
(108,'Canon',135,135,0,0,0,3499,' Canon EF 135mm f/2L USM '),
(109,'Canon',200,200,0,0,1,21999,' Canon EF 200mm f/2L IS USM '),
(110,'Canon',200,200,0,1,0,2759,' Canon EF 200mm f/2.8L II USM '),
(111,'Canon',300,300,0,1,1,24999,'Canon EF 300mm f/2.8L IS II USM '),
(112,'Canon',300,300,0,1,0,5199,' Canon EF 300mm f/4L IS USM '),
(113,'Canon',400,400,0,1,1,39999,'Canon EF 400mm f/2.8L IS II USM '),
(114,'Canon',400,400,0,1,1,26399,'Canon EF 400mm f/4 DO IS II USM '),
(115,'Canon',400,400,0,1,0,4799,' Canon EF 400mm f/5.6L USM '),
(116,'Canon',500,500,0,1,1,35999,' Canon EF 500mm f/4L IS II USM '),
(117,'Canon',600,600,0,1,1,48399,' Canon EF 600mm f/4L IS II USM '),
(118,'Canon',800,800,0,1,1,43999,' Canon EF 800mm f/5.6L IS USM '),
(119,'Canon',8,15,1,1,0,4799,'Canon EF 8-15mm f/4L Fisheye USM'),
(120,'Canon',11,24,0,1,0,12499,' Canon EF 11-24mm f/4L USM '),
(121,'Canon',16,35,0,1,0,5699,' Canon EF 16-35mm f/2.8L II USM '),
(122,'Canon',16,35,0,1,1,3699,' Canon EF 16-35mm f/4L IS USM '),
(123,'Canon',17,40,0,1,0,2999,' Canon EF 17-40mm f/4L USM '),
(124,'Canon',24,70,0,1,0,7249,'Canon EF 24-70mm f/2.8L II USM '),
(125,'Canon',24,70,0,1,1,2999,' Canon EF 24-70mm f/4L IS USM '),
(126,'Canon',24,105,0,0,1,2499,'Canon EF 24-105mm f/3.5-5.6 IS STM '),
(127,'Canon',24,105,0,1,1,2499,'Canon EF 24-105mm f/4L IS USM '),
(128,'Canon',28,300,0,1,1,9599,'Canon EF 28-300mm f/3.5-5.6L IS USM '),
(129,'Canon',70,200,0,1,1,7999,'Canon EF 70-200mm f/2.8L IS II USM '),
(130,'Canon',70,200,0,1,1,4899,'Canon EF 70-200mm f/2.8L USM'),
(131,'Canon',70,200,0,1,1,4499,'Canon EF 70-200mm f/4L IS USM'),
(132,'Canon',70,200,0,1,0,2499,' Canon EF 70-200mm f/4L USM '),
(133,'Canon',70,300,0,0,1,1949,'Canon EF 70-300mm f/4-5.6 IS USM'),
(134,'Canon',70,300,0,1,1,5999,'Canon EF 70-300mm f/4-5.6L IS USM'),
(135,'Canon',70,300,0,0,1,5299,'Canon EF 70-300mm f/4.5-5.6 DO IS USM '),
(136,'Canon',75,300,0,0,0,1199,'Canon EF 75-300mm f/4-5.6 III USM '),
(137,'Canon',75,300,0,0,0,699,' Canon EF 75-300mm f/4-5.6 III'),
(138,'Canon',100,400,0,1,1,8299,'Canon EF 100-400mm f/4.5-5.6L IS II USM'),
(139,'Canon',200,400,0,1,1,42999,' Canon EF 200-400mm f/4L IS USM Extender 1.4x '),
(140,'Canon',50,50,0,0,0,1140,'Canon EF 50mm f/2.5 Compact Macro'),
(141,'Canon',60,60,0,0,0,1759,'Canon EF-S 60mm f/2.8 Macro USM'),
(142,'Canon',100,100,0,0,0,1889,'Canon EF 100mm f/2.8 Macro USM'),
(143,'Canon',100,100,0,0,1,3299,'Canon EF 100mm f/2.8L Macro IS USM'),
(144,'Canon',180,180,0,1,0,5999,'Canon EF 180mm f/3.5L Macro USM'),
(145,'Canon',65,65,0,0,0,4099,'Canon MP-E 65mm f/2.8 1-5x Macro Photo'),
(146,'Canon',17,17,0,1,0,8599,' Canon TS-E 17mm f/4L '),
(147,'Canon',45,45,0,0,0,4999,' Canon TS-E 45mm f/2.8 '),
(148,'Canon',90,90,0,0,0,5449,' Canon TS-E 90mm f/2.8 '),
(149,'Canon',24,34,0,1,0,7999,' Canon TS-E 24mm f/3.5L II '),
(150,'Nikon',18,55,0,0,0,349,'AF-P DX NIKKOR 18-55mm f/3.5-5.6G'),
(151,'Nikon',18,55,0,0,1,399,'AF-P DX NIKKOR 18-55mm f/3.5-5.6G VR'),
(152,'Nikon',55,200,0,0,1,749,' AF-S DX NIKKOR 55-200mm f/4-5.6G ED VR II'),
(153,'Nikon',18,300,0,0,1,4449,' AF-S DX NIKKOR 18–300mm f/3.5–6.3G ED VR'),
(154,'Nikon',18,55,0,0,1,399,' AF-S DX NIKKOR 18–55mm f/3.5–5.6G VR II'),
(155,'Nikon',18,140,0,0,1,1149,' AF-S DX NIKKOR 18-140mm f/3.5-5.6G ED VR'),
(156,'Nikon',18,300,0,0,1,3399,' AF-S DX NIKKOR 18-300mm f/3.5-5.6G ED VR'),
(157,'Nikon',40,40,0,0,0,1049,' AF-S DX Micro NIKKOR 40 mm f/2,8G'),
(158,'Nikon',55,300,0,1,1,1099,' AF-S DX NIKKOR 55-300 mm f/4,5-5,6G ED VR'),
(159,'Nikon',10,10,1,0,0,2699,' AF DX Fisheye-Nikkor 10.5mm f/2.8G ED'),
(160,'Nikon',85,85,0,0,0,2249,' AF-S DX Micro NIKKOR 85 mm f/3,5G ED VR'),
(161,'Nikon',10,24,0,0,0,3249,' AF-S DX NIKKOR 10-24 mm f/3,5-4,5G ED'),
(162,'Nikon',15,85,0,0,1,2299,' AF-S DX NIKKOR 16-85mm f/3.5-5.6G ED VR'),
(163,'Nikon',18,105,0,0,1,769,' AF-S DX NIKKOR 18-105mm f/3.5-5.6G ED VR'),
(164,'Nikon',18,200,0,1,1,749,' AF-S DX NIKKOR 18-200mm f/3.5-5.6G ED VR II'),
(165,'Nikon',18,55,0,0,1,399,' AF-S DX NIKKOR 18-55mm f/3.5-5.6G VR'),
(166,'Nikon',35,35,0,0,0,799,' AF-S DX NIKKOR 35mm f/1.8G'),
(167,'Nikon',55,200,0,0,1,749,' AF-S DX VR Zoom-Nikkor 55-200mm f/4-5.6G IF-ED'),
(168,'Nikon',12,24,0,1,1,4599,' AF-S DX Zoom-Nikkor 12-24mm f/4G IF-ED'),
(169,'Nikon',18,55,0,0,1,399,' AF-S DX Zoom-Nikkor 18-55mm f/3.5-5.6G ED II'),
(170,'Nikon',17,55,0,0,1,5099,' AF-S DX Zoom-Nikkor 17-55mm f/2.8G IF-ED'),
(171,'Samyang',100,100,0,0,0,1599,'100mm F2.8 ED UMC MACRO'),
(172,'Samyang',135,135,0,0,0,2259,'135mm F2.0 ED UMC '),
(173,'Samyang',12,12,1,0,0,1999,'12mm F2.8 ED AS NCS FISH-EYE'),
(174,'Samyang',50,50,0,0,0,1578,'50mm F1.4 AS UMC'),
(175,'Samyang',8,8,1,0,0,1049,'8mm F3.5 UMC Fish-Eye CS II'),
(176,'Samyang',14,14,0,0,0,1399,'14mm F2.8 ED AS IF UMC'),
(177,'Samyang',16,16,0,0,0,1349,'16mm F2.0 ED AS UMC CS'),
(178,'Samyang',24,24,0,0,0,2799,'TILT/SHIFT LENS 24mm F3.5 ED AS UMC'),
(179,'Samyang',24,24,0,0,0,1999,'24mm F1.4 ED AS IF UMC'),
(180,'Samyang',35,35,0,0,0,1829,'35mm F1.4 AS UMC'),
(181,'Samyang',85,85,0,0,0,1149,'85mm F1.4 AS IF UMC'),
(182,'Samyang',10,10,0,0,0,1699,'10mm F2.8 ED AS NCS CS'),
(183,'Samyang',12,12,0,0,0,1199,'12mm F2.0 NCS CS'),
(184,'Samyang',7,7,1,0,0,999,'7.5mm F3.5 Fish-eye Lens'),
(185,'Samyang',8,8,1,0,0,1089,'8mm F2.8 UMC Fish-eye II');
