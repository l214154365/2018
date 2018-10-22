# Host: localhost  (Version: 5.0.96-community-nt)
# Date: 2018-09-28 21:16:50
# Generator: MySQL-Front 5.3  (Build 4.214)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "clazz"
#

CREATE TABLE `clazz` (
  `Id` int(11) NOT NULL auto_increment COMMENT '班级表id',
  `Clazz_Name` varchar(30) default '' COMMENT '班级名称',
  `Clazz_Id` int(11) default NULL COMMENT '班级id',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='班级表';

#
# Data for table "clazz"
#

INSERT INTO `clazz` VALUES (1,'软件1班',1590001),(2,'软件2班',1590002),(3,'软件3班',1590003),(4,'软件4班',1590004),(5,'软件5班',1590005),(6,'软件6班',1590006),(7,'软件7班',1590007),(10,'软件8班',1590008),(11,'软件9班',1590009),(12,'软件10班',1590010),(13,'软件11班',1590011),(14,'软件12班',1590012);

#
# Structure for table "clazz_course"
#

CREATE TABLE `clazz_course` (
  `Id` int(11) NOT NULL auto_increment COMMENT '班级课程表id',
  `Clazz_id` int(11) default NULL COMMENT '班级id',
  `Course_id` int(11) default NULL COMMENT '课程id',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='班级课程表';

#
# Data for table "clazz_course"
#

INSERT INTO `clazz_course` VALUES (1,1590001,1),(13,1590002,1),(14,1590002,2),(15,1590002,3),(16,1590010,5),(17,1590012,4),(19,1590008,1),(20,1590004,4),(21,1590004,5),(22,1590004,6),(23,1590007,5),(24,1590008,4);

#
# Structure for table "course"
#

CREATE TABLE `course` (
  `Id` int(11) NOT NULL auto_increment COMMENT '课程表id',
  `Course_name` varchar(50) default NULL COMMENT '课程名称',
  `Course_id` int(11) default NULL COMMENT '课程id',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='课程表';

#
# Data for table "course"
#

INSERT INTO `course` VALUES (1,'软件工程',1),(2,'java程序开发',2),(3,'人机交互',3),(4,'数据库设计',4),(5,'马克思主义',5),(6,'毛泽东思想',6),(7,'邓小平理论',7);

#
# Structure for table "department"
#

CREATE TABLE `department` (
  `Id` int(11) NOT NULL auto_increment COMMENT '院系表id',
  `department_name` varchar(50) default NULL COMMENT '学院院名',
  `department_id` int(11) default NULL COMMENT '学院id',
  `department_num` int(11) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='院系表';

#
# Data for table "department"
#

INSERT INTO `department` VALUES (1,'经济学',0,1),(2,'经济与金融',1,5),(3,'文学',0,2),(4,'英语 ',3,6),(5,'日语',3,7),(6,'新闻学',3,8),(7,'理学',0,3),(8,'数学与应用数学',7,9),(9,'数理基础科学',7,10),(10,' 物理学',7,11),(11,' 化学',7,12),(12,'化学生物学',7,13),(13,' 生物科学',7,14),(14,'工学',0,4),(15,'机械工程',14,15),(16,' 车辆工程',14,16),(17,' 软件工程',14,17),(18,' 土木工程',14,18),(19,'计算机科学与技术',14,19),(20,' 自动化',14,20),(22,'电气工程及其自动化',14,21),(23,'电子信息类',14,22),(30,' 材料科学与工程',14,24),(31,' 测控技术与仪器',14,25);

#
# Structure for table "eva_oao"
#

CREATE TABLE `eva_oao` (
  `Id` int(11) NOT NULL auto_increment COMMENT '评价总结表 id',
  `Total_score` varchar(50) default NULL COMMENT '最后总分',
  `Voted_id` varchar(50) default NULL COMMENT '被评价人id',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评价总结表';

#
# Data for table "eva_oao"
#


#
# Structure for table "indicator"
#

CREATE TABLE `indicator` (
  `Id` int(11) NOT NULL auto_increment COMMENT '指标表 id',
  `F_id` int(11) default NULL COMMENT '下级指标id',
  `Weight` varchar(30) default NULL COMMENT '指标权重',
  `In_type` int(11) default NULL COMMENT '指标类型',
  `Indicator_name` varchar(255) default NULL COMMENT '指标名称',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8 COMMENT='指标表';

#
# Data for table "indicator"
#

INSERT INTO `indicator` VALUES (1,0,'0.3',1,'学 生 方 面'),(2,0,'0.25',2,'系  (部) 方  面'),(3,0,'0.20',3,'教  研  室  方  面'),(4,0,'0.15',4,'同行方面（领导、督导）'),(5,0,'0.10',5,'教师个人方面'),(6,1,'0.15',1,'概念的讲解'),(7,1,'0.15',1,'重点和难点'),(8,1,'0.10',1,'逻辑性和条理性'),(9,1,'0.10',1,'趣味性和生动性'),(10,1,'0.05',1,'板书'),(11,1,'0.08',1,'辅导（阅读指导）'),(12,1,'0.10',1,'作业与批改'),(13,1,'0.10',1,'能力培养'),(14,1,'0.10',1,'教书育人'),(15,1,'0.07',1,'为人师表'),(16,2,'0.30',2,'量考核'),(17,2,'0.70',2,'质考核'),(18,16,'0.75',2,'教学工作量'),(19,16,'0.15',2,'社会工作量'),(20,16,'0.10',2,'任课班级'),(21,17,'0.40',2,'工作态度'),(22,17,'0.15',2,'学术与研究水平'),(23,17,'0.05',2,'完成任务情况'),(24,17,'0.05',2,'教学水平变化'),(25,17,'0.15',2,'教学反映'),(26,17,'0.10',2,'能力培养'),(27,17,'0.05',2,'汲取新信息新技术'),(28,17,'0.05',2,'考试命题'),(29,21,'0.10',2,'接受任务态度'),(30,21,'0.90',2,'教学常规'),(31,30,'0.10',2,'授课计划的制定'),(32,30,'0.20',2,'教案首页'),(33,30,'0.10',2,'备课余量'),(34,30,'0.10',2,'教学日志手册的填写'),(35,30,'0.10',2,'教学表格的填写'),(36,30,'0.20',2,'辅导'),(37,30,'0.20',2,'教学秩序的掌握'),(38,22,'0.10',2,'职称'),(39,22,'0.40',2,'运用新知识、新技术能力'),(40,22,'0.50',2,'论文撰写、教材编写能力'),(41,3,'0.60',3,'教学环节'),(42,3,'0.05',3,'接受任务的态度'),(43,3,'0.05',3,'汲取新技术'),(44,3,'0.10',3,'学术与研究水平'),(45,3,'0.20',3,'参加教研活动'),(46,41,'0.15',3,'概念的讲解'),(47,41,'0.15',3,'重点和难点'),(48,41,'0.10',3,'逻辑性、条理性'),(49,41,'0.10',3,'趣味性、生动性'),(50,41,'0.05',3,'板书'),(51,41,'0.15',3,'能力培养'),(52,41,'0.10',3,'理论联系实际'),(53,41,'0.10',3,'辅导（阅读指导'),(54,41,'0.10',3,'作业与批改'),(55,4,'0.15',4,'组织教学'),(56,4,'0.15',4,'教学内容与教学要求'),(57,4,'0.10',4,'概念讲解'),(58,4,'0.08',4,'趣味性与生动性'),(59,4,'0.10',4,'重点和难点'),(60,4,'0.07',4,'直观教学与板书'),(61,4,'0.10',4,'智力能力的培养'),(62,4,'0.10',4,'理论联系实际'),(63,4,'0.15',4,'教材处理');

#
# Structure for table "management"
#

CREATE TABLE `management` (
  `Id` int(11) NOT NULL auto_increment COMMENT '管理任务id',
  `status` int(11) default NULL COMMENT '任务状态标识',
  `s_time` datetime default NULL COMMENT '任务开启时间',
  `e_time` datetime default NULL COMMENT '任务关闭时间',
  `m_name` varchar(255) default NULL COMMENT '任务名称',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='评价管理表';

#
# Data for table "management"
#

INSERT INTO `management` VALUES (1,0,NULL,'2018-09-18 00:00:00',NULL),(2,0,NULL,'2018-09-19 00:00:00',NULL);

#
# Structure for table "menu"
#

CREATE TABLE `menu` (
  `Id` int(11) NOT NULL auto_increment,
  `context` varchar(255) default NULL,
  `nav_id` int(11) default NULL,
  `parent_id` int(11) default NULL,
  `role_menu` int(11) default NULL,
  `menu_id` int(11) default NULL,
  `a_context` varchar(255) default 'javascript:void(0)',
  `F_id` int(11) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

#
# Data for table "menu"
#

INSERT INTO `menu` VALUES (1,'首页',1,0,4,1,'/T_e_s/main',0),(2,'学生管理',2,0,4,3,'javascript:void(0)',0),(3,'学生信息导入',0,2,4,4,'/T_e_s/student',2),(4,'学生密码管理',0,2,4,5,'javascript:void(0)',2),(5,'教师管理',3,0,4,7,'javascript:void(0)',0),(6,'教师信息导入',0,3,4,8,'/T_e_s/teacher',5),(7,'教师密码管理',0,3,4,9,'javascript:void(0)',5),(8,'评教管理',4,0,4,11,'javascript:void(0)',0),(16,'首页',1,0,1,1,'/T_e_s/main',0),(18,'信息管理',2,0,1,3,'javascript:void(0)',0),(19,'修改密码',0,2,1,4,'/T_e_s/update_info',18),(20,'信息修改',0,2,1,5,'javascript:void(0)',18),(21,'教师评价',3,0,1,7,'javascript:void(0)',0),(22,'查看评价',0,3,1,9,'javascript:void(0)',21),(23,'参与评价',0,3,1,10,'javascript:void(0)',21),(27,'首页',1,0,2,1,'/T_e_s/main',0),(29,'信息管理',2,0,2,3,'javascript:void(0)',0),(30,'密码修改',0,2,2,4,'/T_e_s/update_info',29),(31,'信息修改',0,2,2,5,'javascript:void(0)',29),(33,'教师评价',3,0,2,7,'javascript:void(0)',0),(34,'查看评价',0,3,2,8,'javascript:void(0)',33),(35,'同行评价',0,3,2,10,'javascript:void(0)',33),(36,'教师自我评价',0,3,2,11,'javascript:void(0)',33),(38,'首页',1,0,3,1,'/T_e_s/main',0),(40,'信息管理',2,0,3,3,'javascript:void(0)',0),(41,'密码修改',0,2,3,4,'javascript:void(0)',40),(42,'信息修改',0,2,3,5,'javascript:void(0)',40),(44,'教师评价',3,0,3,7,'javascript:void(0)',0),(45,'查看评价',0,3,3,8,'javascript:void(0)',44),(46,'参与评价',0,3,3,9,'javascript:void(0)',44),(48,'行课管理',6,0,4,19,'javascript:void(0)',0),(50,'课程管理',0,6,4,20,'/T_e_s/course',48),(51,'班级管理',0,6,4,21,'/T_e_s/clazz',48),(52,'班级课程管理',0,6,4,22,'/T_e_s/clazzAcourse',48),(53,'系统管理',7,0,4,25,'javascript:void(0)',0),(55,'增加菜单',0,7,4,26,'/T_e_s/menu',53),(59,'删除菜单',0,7,4,27,'/T_e_s/deletemenu',53),(60,'部门管理',5,0,4,12,'javascript:void(0)',0),(61,'增加部门',0,5,4,13,'/T_e_s/department',60),(62,'删除部门',0,5,4,14,'/T_e_s/deletedp',60),(63,'教师课程管理',0,6,4,23,'/T_e_s/teachAcourse',48);

#
# Structure for table "obj_role"
#

CREATE TABLE `obj_role` (
  `Id` int(11) NOT NULL auto_increment,
  `role_id` int(11) default NULL COMMENT '角色id',
  `obj_Id` varchar(255) default NULL COMMENT '班级id',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='角色权限表';

#
# Data for table "obj_role"
#

INSERT INTO `obj_role` VALUES (3,3,'200002'),(4,4,'200003'),(5,1,'15900101');

#
# Structure for table "paper"
#

CREATE TABLE `paper` (
  `Id` int(11) NOT NULL auto_increment COMMENT '评价中间表 id',
  `User_id` varchar(255) default NULL COMMENT '评价人id',
  `Score` varchar(255) default NULL COMMENT '单人评价成绩',
  `Voted_id` varchar(255) default NULL COMMENT '被评价人id',
  `Time` datetime default NULL COMMENT '评价时间',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评价中间表';

#
# Data for table "paper"
#


#
# Structure for table "power"
#

CREATE TABLE `power` (
  `Id` int(11) NOT NULL auto_increment,
  `power_name` varchar(255) default NULL COMMENT '权限名称',
  `F_id` int(11) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='权限表';

#
# Data for table "power"
#

INSERT INTO `power` VALUES (1,'评教权限',NULL),(2,'修改密码',NULL);

#
# Structure for table "role"
#

CREATE TABLE `role` (
  `Id` int(11) NOT NULL auto_increment,
  `角色名称` varchar(255) default NULL COMMENT '角色名称',
  `角色id` int(11) default NULL COMMENT '角色id',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='角色表';

#
# Data for table "role"
#

INSERT INTO `role` VALUES (1,'学生',1),(2,'普通教师',2),(3,'领导',3),(5,'管理员',4);

#
# Structure for table "role_power"
#

CREATE TABLE `role_power` (
  `Id` int(11) NOT NULL auto_increment,
  `role_id` int(11) default NULL COMMENT '角色id',
  `power_id` int(11) default NULL COMMENT '权限id',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色权限表';

#
# Data for table "role_power"
#

INSERT INTO `role_power` VALUES (1,1,1),(2,1,2);

#
# Structure for table "student"
#

CREATE TABLE `student` (
  `Id` int(11) NOT NULL auto_increment COMMENT '学生表id',
  `S_id` varchar(255) default NULL COMMENT '学号',
  `S_Name` varchar(50) default NULL COMMENT '学生姓名',
  `S_Pass` varchar(255) default NULL COMMENT '学生密码',
  `Clazz_Id` int(11) default NULL COMMENT '班级id',
  `S_type` int(11) default '1' COMMENT '学生权限',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='学生表';

#
# Data for table "student"
#

INSERT INTO `student` VALUES (1,'15900101','麻麻','15900101',1590001,1);

#
# Structure for table "teacher"
#

CREATE TABLE `teacher` (
  `Id` int(11) NOT NULL auto_increment,
  `T_id` varchar(255) default NULL COMMENT '教师工号',
  `T_Name` varchar(255) default NULL COMMENT '教师姓名',
  `T_Pass` varchar(255) default NULL COMMENT '教师密码',
  `D_id` int(11) default NULL COMMENT '院系id',
  `T_type` int(11) default '2',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='教师表';

#
# Data for table "teacher"
#

INSERT INTO `teacher` VALUES (1,'200001','王丽','200001',2,2),(2,'200002','小明','200004',2,2),(3,'200003','小红','200003',2,2);

#
# Structure for table "teacher_course"
#

CREATE TABLE `teacher_course` (
  `Id` int(11) NOT NULL auto_increment COMMENT '教师_课程表id',
  `Course_id` int(11) default NULL COMMENT '课程id',
  `Teacher_id` varchar(255) default NULL COMMENT '教师id',
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='教师课程表';

#
# Data for table "teacher_course"
#

INSERT INTO `teacher_course` VALUES (1,1,'200001'),(2,2,'200003'),(3,3,'200001'),(4,4,'200002'),(5,5,'200002'),(6,6,'200003'),(7,3,'200003'),(8,5,'200003'),(9,1,'200002');

#
# Function "getChildLst"
#

CREATE FUNCTION `getChildLst`(rootId INT) RETURNS varchar(1000) CHARSET utf8
BEGIN 
DECLARE sTemp VARCHAR(1000); 
DECLARE sTempChd VARCHAR(1000); 

SET sTemp = ‘$’; 
SET sTempChd =cast(rootId as CHAR); 

WHILE sTempChd is not null DO 
SET sTemp = concat(sTemp,’,’,sTempChd); 
SELECT group_concat(id) INTO sTempChd FROM treeNodes where FIND_IN_SET(pid,sTempChd)>0; 
END WHILE; 
RETURN sTemp; 
END;
