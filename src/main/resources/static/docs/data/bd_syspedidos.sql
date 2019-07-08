/*
Navicat MySQL Data Transfer

Source Server         : 192.168.0.9-restful_user-123456
Source Server Version : 50714
Source Host           : 192.168.0.9:3306
Source Database       : bd_syspedidos

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2019-07-08 01:12:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_catalogo
-- ----------------------------
DROP TABLE IF EXISTS `tb_catalogo`;
CREATE TABLE `tb_catalogo` (
  `param_catalogo` varchar(3) NOT NULL,
  `param_catalogo_elemento` varchar(3) NOT NULL,
  `descripcion_corta` varchar(200) DEFAULT NULL,
  `descricpcion` text,
  `tipo` char(1) DEFAULT NULL COMMENT 'C: Cabecera\nD: Detalle',
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`param_catalogo`,`param_catalogo_elemento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_catalogo
-- ----------------------------
INSERT INTO `tb_catalogo` VALUES ('001', '000', 'CARGOS', 'CARGOS', 'C', '1', 'JTV_ADMIN', '2019-07-04 23:11:57', null, null);
INSERT INTO `tb_catalogo` VALUES ('001', '001', 'SYSADMIN', 'SYSADMIN', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:13:05', null, null);
INSERT INTO `tb_catalogo` VALUES ('001', '002', 'GERENTE GENERAL', 'GERENTE GENERAL', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:14:03', null, null);
INSERT INTO `tb_catalogo` VALUES ('002', '000', 'AREAS', 'AREAS', 'C', '1', 'JTV_ADMIN', '2019-07-04 23:15:31', null, null);
INSERT INTO `tb_catalogo` VALUES ('002', '001', 'SYSADMIN', 'SYSADMIN', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:15:50', null, null);
INSERT INTO `tb_catalogo` VALUES ('002', '002', 'GERENCIA', 'GERENCIA', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:16:19', null, null);
INSERT INTO `tb_catalogo` VALUES ('003', '000', 'ZONAS', 'ZONAS', 'C', '1', 'JTV_ADMIN', '2019-07-04 23:17:19', null, null);
INSERT INTO `tb_catalogo` VALUES ('003', '001', 'SYSADMIN', 'SYSADMIN', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:17:37', null, null);
INSERT INTO `tb_catalogo` VALUES ('003', '002', 'LIMA', 'LIMA', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:17:54', null, null);
INSERT INTO `tb_catalogo` VALUES ('004', '000', 'TIPOS DE DOCUMENTOS', 'TIPOS DE DOCUMENTOS', 'C', '1', 'JTV_ADMIN', '2019-07-04 23:18:53', null, null);
INSERT INTO `tb_catalogo` VALUES ('004', '001', 'SYSADMIN', 'SYSADMIN', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:19:22', null, null);
INSERT INTO `tb_catalogo` VALUES ('004', '002', 'DNI', 'DOCUMENTO NACIONAL DE IDENTIDAD', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:19:36', null, null);
INSERT INTO `tb_catalogo` VALUES ('005', '000', 'MARCAS DE PRODUCTOS', 'MARCAS DE PRODUCTOS', 'C', '1', 'JTV_ADMIN', '2019-07-04 23:20:03', null, null);
INSERT INTO `tb_catalogo` VALUES ('005', '001', 'SYSADMIN', 'SYSADMIN', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:20:17', null, null);
INSERT INTO `tb_catalogo` VALUES ('005', '002', 'RICOCAN', 'RICOCAN', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:20:31', null, null);
INSERT INTO `tb_catalogo` VALUES ('006', '000', 'MODELOS DE PRODUCTOS', 'MODELOS DE PRODUCTOS', 'C', '1', 'JTV_ADMIN', '2019-07-04 23:20:55', null, null);
INSERT INTO `tb_catalogo` VALUES ('006', '001', 'SYSADMIN', 'SYSADMIN', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:21:07', null, null);
INSERT INTO `tb_catalogo` VALUES ('006', '002', 'CACHORROS EN BOLSA', 'CACHORROS EN BOLSA', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:22:28', null, null);
INSERT INTO `tb_catalogo` VALUES ('007', '000', 'CÓDIGOS DE ESTADO DE PEDIDOS', 'CÓDIGOS DE ESTADO DE PEDIDOS', 'C', '1', 'JTV_ADMIN', '2019-07-04 23:22:53', null, null);
INSERT INTO `tb_catalogo` VALUES ('007', '001', 'POR EVALUAR', 'POR EVALUAR: CUANDO EL VENDEDOR RECIÉN REGISTRA EL PEDIDO', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:23:47', null, null);
INSERT INTO `tb_catalogo` VALUES ('007', '002', 'ANULADO', 'ANULADO: CUANDO POR ALGÚN MOTIVO SE ANULA EL PEDIDO (POR EJEMPLO, SI HAY ERRORES SE INGRESAR OTRO)', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:25:40', null, null);
INSERT INTO `tb_catalogo` VALUES ('007', '003', 'RECHAZADO', 'RECHAZADO: PUEDE SER POR SOBREPASAR LINEA DE CRED. O CLIENTE MOROSO, ETC', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:26:30', null, null);
INSERT INTO `tb_catalogo` VALUES ('007', '004', 'ACEPTADO', 'ACEPTADO: CUANDO EL ÁREA DE DESPACHO ACEPTA PROCESAR EL PEDIDO PARA DESPACHARLO', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:27:19', null, null);
INSERT INTO `tb_catalogo` VALUES ('007', '005', 'EN DESPACHO', 'EN DESPACHO: CUANDO EL PEDIDO ESTÁ SIENDO PREPARADO PARA DESPACHARLO', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:28:10', null, null);
INSERT INTO `tb_catalogo` VALUES ('007', '006', 'EN TRANSPORTE', 'EN TRANSPORTE: CUANDO EL PEDIDO SE ENCUENTRA EN CAMINO HACIA EL CLIENTE', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:28:36', null, null);
INSERT INTO `tb_catalogo` VALUES ('007', '007', 'ENTREGADO', 'ENTREGADO: CUANDO HA SIDO ENTREGADO AL CLIENTE', 'D', '1', 'JTV_ADMIN', '2019-07-04 23:28:56', null, null);

-- ----------------------------
-- Table structure for tb_categoria_producto
-- ----------------------------
DROP TABLE IF EXISTS `tb_categoria_producto`;
CREATE TABLE `tb_categoria_producto` (
  `tb_categoria_producto_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(100) DEFAULT NULL,
  `tb_categoria_producto_id_padre` int(11) DEFAULT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_categoria_producto_id`),
  KEY `fk_tb_categoria_producto_tb_categoria_producto1_idx` (`tb_categoria_producto_id_padre`),
  CONSTRAINT `fk_tb_categoria_producto_tb_categoria_producto1` FOREIGN KEY (`tb_categoria_producto_id_padre`) REFERENCES `tb_categoria_producto` (`tb_categoria_producto_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_categoria_producto
-- ----------------------------

-- ----------------------------
-- Table structure for tb_cliente
-- ----------------------------
DROP TABLE IF EXISTS `tb_cliente`;
CREATE TABLE `tb_cliente` (
  `tb_cliente_id` int(11) NOT NULL AUTO_INCREMENT,
  `num_ruc` varchar(11) DEFAULT NULL,
  `razon_social` varchar(400) DEFAULT NULL,
  `cod_zona` varchar(6) DEFAULT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_cliente_id`),
  UNIQUE KEY `razon_social_UNIQUE` (`razon_social`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_cliente
-- ----------------------------

-- ----------------------------
-- Table structure for tb_datos_personales
-- ----------------------------
DROP TABLE IF EXISTS `tb_datos_personales`;
CREATE TABLE `tb_datos_personales` (
  `tb_datos_personales_id` int(11) NOT NULL AUTO_INCREMENT,
  `cod_tipo_documento` varchar(6) DEFAULT NULL COMMENT 'catalogo: 004',
  `num_documento` varchar(45) DEFAULT NULL,
  `nombres` varchar(100) DEFAULT NULL,
  `apellido_paterno` varchar(50) DEFAULT NULL,
  `apellido_materno` varchar(50) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `fec_nacimiento` date DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `telefono1` varchar(45) DEFAULT NULL,
  `telefono2` varchar(45) DEFAULT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_datos_personales_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_datos_personales
-- ----------------------------
INSERT INTO `tb_datos_personales` VALUES ('1', '004002', '45656565', 'SYSADMIN', 'SYSADMIN', 'SYSADMIN', 'jtejadavilca@gmail.com', '1990-04-04', '987789877', null, null, '1', 'JTV_ADMIN', '2019-07-04 23:40:52', null, null);
INSERT INTO `tb_datos_personales` VALUES ('2', '004002', '45749544', 'LINDA', 'HUARANGA', 'PAREDES', 'linda.hparedes', '1990-04-03', '991368783', null, null, '1', 'JTV_ADMIN', '2019-07-08 01:10:59', null, null);
INSERT INTO `tb_datos_personales` VALUES ('3', '004002', '45749544', 'VASCO', 'TEJADA', 'HUARANGA', 'vasco.giusep@gmail.com', '1990-04-03', '991368783', null, null, '1', 'JTV_ADMIN', '2019-07-08 01:10:59', null, null);

-- ----------------------------
-- Table structure for tb_direccion
-- ----------------------------
DROP TABLE IF EXISTS `tb_direccion`;
CREATE TABLE `tb_direccion` (
  `tb_direccion_id` int(11) NOT NULL AUTO_INCREMENT,
  `tb_ubigeo_id` int(11) NOT NULL,
  `tb_cliente_id` int(11) DEFAULT NULL,
  `tb_datos_personales_id` int(11) DEFAULT NULL,
  `urbanizacion` varchar(80) DEFAULT NULL,
  `avenida` varchar(80) DEFAULT NULL,
  `jiron` varchar(80) DEFAULT NULL,
  `calle` varchar(80) DEFAULT NULL,
  `manzana` varchar(5) DEFAULT NULL,
  `lote` varchar(5) DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `letra` varchar(2) DEFAULT NULL,
  `piso` int(11) DEFAULT NULL,
  `bloque` varchar(80) DEFAULT NULL,
  `predeterminado` int(11) DEFAULT '1' COMMENT '1:Predeterminado\n2: No predeterminado\nUn cliente puede terner más de una dirección, por lo que debe haber un predeterminado.\nUn empleado debería tener al menos registrada una dirección',
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_direccion_id`),
  KEY `fk_tb_direccion_tb_ubigeo1_idx` (`tb_ubigeo_id`),
  KEY `fk_tb_direccion_tb_cliente1_idx` (`tb_cliente_id`),
  KEY `fk_tb_direccion_tb_datos_personales1_idx` (`tb_datos_personales_id`),
  CONSTRAINT `fk_tb_direccion_tb_cliente1` FOREIGN KEY (`tb_cliente_id`) REFERENCES `tb_cliente` (`tb_cliente_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_direccion_tb_datos_personales1` FOREIGN KEY (`tb_datos_personales_id`) REFERENCES `tb_datos_personales` (`tb_datos_personales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_direccion_tb_ubigeo1` FOREIGN KEY (`tb_ubigeo_id`) REFERENCES `tb_ubigeo` (`tb_ubigeo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_direccion
-- ----------------------------

-- ----------------------------
-- Table structure for tb_empleado
-- ----------------------------
DROP TABLE IF EXISTS `tb_empleado`;
CREATE TABLE `tb_empleado` (
  `tb_empleado_id` int(11) NOT NULL AUTO_INCREMENT,
  `tb_datos_personales_id` int(11) NOT NULL,
  `cod_cargo` varchar(6) DEFAULT NULL COMMENT 'catalogo: 001',
  `cod_area` varchar(6) DEFAULT NULL COMMENT 'catalogo: 002',
  `cod_zona` varchar(6) DEFAULT NULL COMMENT 'catalogo: 003',
  `fec_ini_vigencia` date DEFAULT NULL,
  `fec_fin_vigencia` date DEFAULT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_empleado_id`),
  KEY `fk_tb_empleado_tb_datos_personales1_idx` (`tb_datos_personales_id`),
  CONSTRAINT `fk_tb_empleado_tb_datos_personales1` FOREIGN KEY (`tb_datos_personales_id`) REFERENCES `tb_datos_personales` (`tb_datos_personales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_empleado
-- ----------------------------
INSERT INTO `tb_empleado` VALUES ('1', '1', '001001', '001001', '001001', '1900-01-01', '2599-12-31', '1', 'JTV_ADMIN', '2019-07-04 23:31:17', null, null);
INSERT INTO `tb_empleado` VALUES ('2', '2', '001001', '001001', '001001', '1899-12-31', '2599-12-30', '1', 'JTV_ADMIN', '2019-07-08 01:10:59', null, null);
INSERT INTO `tb_empleado` VALUES ('3', '3', '001001', '001001', '001001', '1899-12-31', '2599-12-30', '1', 'JTV_ADMIN', '2019-07-08 01:10:59', null, null);

-- ----------------------------
-- Table structure for tb_menu
-- ----------------------------
DROP TABLE IF EXISTS `tb_menu`;
CREATE TABLE `tb_menu` (
  `tb_menu_id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT NULL,
  `icono` varchar(50) DEFAULT NULL,
  `visible_web` int(11) DEFAULT '1' COMMENT '1: Visible en web\n0: No visible en web',
  `visible_movil` int(11) DEFAULT '0' COMMENT '1: Visible en móvil\n0: No visible en móvil',
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_menu
-- ----------------------------

-- ----------------------------
-- Table structure for tb_pedido
-- ----------------------------
DROP TABLE IF EXISTS `tb_pedido`;
CREATE TABLE `tb_pedido` (
  `tb_pedido_id` int(11) NOT NULL AUTO_INCREMENT,
  `cod_estado_pedido` varchar(6) DEFAULT NULL,
  `tb_cliente_id` int(11) NOT NULL,
  `tb_direccion_id` int(11) NOT NULL,
  `fecha_tentativa_entrega` date DEFAULT NULL,
  `fecha_entrega` datetime DEFAULT NULL,
  `monto_base` varchar(45) DEFAULT NULL COMMENT 'Monto total bruto del pedido',
  `monto_final` double DEFAULT NULL COMMENT 'Monto total neto, luego de aplicar algún descuento en caso se dé.',
  `usu_entrega` varchar(45) DEFAULT NULL,
  `origen_registro` int(11) NOT NULL COMMENT '1: APP MOVIL\n2: APP WEB\n3: BATCH',
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) DEFAULT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_pedido_id`),
  KEY `fk_tb_pedido_tb_cliente1_idx` (`tb_cliente_id`),
  KEY `fk_tb_pedido_tb_direccion1_idx` (`tb_direccion_id`),
  CONSTRAINT `fk_tb_pedido_tb_cliente1` FOREIGN KEY (`tb_cliente_id`) REFERENCES `tb_cliente` (`tb_cliente_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_pedido_tb_direccion1` FOREIGN KEY (`tb_direccion_id`) REFERENCES `tb_direccion` (`tb_direccion_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pedido
-- ----------------------------

-- ----------------------------
-- Table structure for tb_pedido_detalle
-- ----------------------------
DROP TABLE IF EXISTS `tb_pedido_detalle`;
CREATE TABLE `tb_pedido_detalle` (
  `tb_pedido_detalle_id` int(11) NOT NULL AUTO_INCREMENT,
  `tb_pedido_id` int(11) NOT NULL,
  `tb_producto_id` int(11) NOT NULL,
  `precio_unidad_final` float DEFAULT NULL,
  `cantidad` float DEFAULT NULL,
  `observacion` text,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_pedido_detalle_id`),
  KEY `fk_tb_pedido_detalle_tb_pedido1_idx` (`tb_pedido_id`),
  KEY `fk_tb_pedido_detalle_tb_producto1_idx` (`tb_producto_id`),
  CONSTRAINT `fk_tb_pedido_detalle_tb_pedido1` FOREIGN KEY (`tb_pedido_id`) REFERENCES `tb_pedido` (`tb_pedido_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_pedido_detalle_tb_producto1` FOREIGN KEY (`tb_producto_id`) REFERENCES `tb_producto` (`tb_producto_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pedido_detalle
-- ----------------------------

-- ----------------------------
-- Table structure for tb_persona_contacto
-- ----------------------------
DROP TABLE IF EXISTS `tb_persona_contacto`;
CREATE TABLE `tb_persona_contacto` (
  `tb_persona_contacto_id` int(11) NOT NULL AUTO_INCREMENT,
  `tb_cliente_id` int(11) NOT NULL,
  `tb_datos_personales_id` int(11) NOT NULL,
  `seleccion_defecto` int(11) DEFAULT '1' COMMENT '0:No es seleccionada por defecto\n1: Seleccionada por defecto (Para atender pedido, recepcionar pedido, firmar recepción, etc)',
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_persona_contacto_id`),
  KEY `fk_tb_persona_contacto_tb_cliente1_idx` (`tb_cliente_id`),
  KEY `fk_tb_persona_contacto_tb_datos_personales1_idx` (`tb_datos_personales_id`),
  CONSTRAINT `fk_tb_persona_contacto_tb_cliente1` FOREIGN KEY (`tb_cliente_id`) REFERENCES `tb_cliente` (`tb_cliente_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_persona_contacto_tb_datos_personales1` FOREIGN KEY (`tb_datos_personales_id`) REFERENCES `tb_datos_personales` (`tb_datos_personales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_persona_contacto
-- ----------------------------

-- ----------------------------
-- Table structure for tb_producto
-- ----------------------------
DROP TABLE IF EXISTS `tb_producto`;
CREATE TABLE `tb_producto` (
  `tb_producto_id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(100) DEFAULT NULL,
  `cod_marca` varchar(6) DEFAULT NULL COMMENT 'cod_categoria',
  `tb_categoria_producto_id` int(11) NOT NULL,
  `cod_modelo` varchar(6) DEFAULT NULL,
  `numero_serie` varchar(100) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `stock` mediumtext,
  `lote` varchar(45) DEFAULT NULL,
  `tamanho` varchar(45) DEFAULT NULL,
  `color` varchar(45) DEFAULT NULL,
  `precio_venta` float DEFAULT NULL,
  `precio_compra` float DEFAULT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tb_producto_id`),
  UNIQUE KEY `numero_serie_UNIQUE` (`numero_serie`),
  KEY `fk_tb_producto_tb_categoria_producto1_idx` (`tb_categoria_producto_id`),
  CONSTRAINT `fk_tb_producto_tb_categoria_producto1` FOREIGN KEY (`tb_categoria_producto_id`) REFERENCES `tb_categoria_producto` (`tb_categoria_producto_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_producto
-- ----------------------------

-- ----------------------------
-- Table structure for tb_rol
-- ----------------------------
DROP TABLE IF EXISTS `tb_rol`;
CREATE TABLE `tb_rol` (
  `tb_rol_id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_rol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_rol
-- ----------------------------

-- ----------------------------
-- Table structure for tb_rol_menu
-- ----------------------------
DROP TABLE IF EXISTS `tb_rol_menu`;
CREATE TABLE `tb_rol_menu` (
  `tb_rol_menu_id` int(11) NOT NULL AUTO_INCREMENT,
  `tb_rol_id` int(11) NOT NULL,
  `tb_menu_id` int(11) NOT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_rol_menu_id`),
  KEY `fk_tb_rol_menu_tb_rol1_idx` (`tb_rol_id`),
  KEY `fk_tb_rol_menu_tb_menu1_idx` (`tb_menu_id`),
  CONSTRAINT `fk_tb_rol_menu_tb_menu1` FOREIGN KEY (`tb_menu_id`) REFERENCES `tb_menu` (`tb_menu_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_rol_menu_tb_rol1` FOREIGN KEY (`tb_rol_id`) REFERENCES `tb_rol` (`tb_rol_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_rol_menu
-- ----------------------------

-- ----------------------------
-- Table structure for tb_rol_usuario
-- ----------------------------
DROP TABLE IF EXISTS `tb_rol_usuario`;
CREATE TABLE `tb_rol_usuario` (
  `tb_rol_usuario_id` int(11) NOT NULL AUTO_INCREMENT,
  `tb_rol_id` int(11) NOT NULL,
  `tb_usuario_id` int(11) NOT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_rol_usuario_id`),
  KEY `fk_tb_rol_usuario_tb_rol1_idx` (`tb_rol_id`),
  KEY `fk_tb_rol_usuario_tb_usuario1_idx` (`tb_usuario_id`),
  CONSTRAINT `fk_tb_rol_usuario_tb_rol1` FOREIGN KEY (`tb_rol_id`) REFERENCES `tb_rol` (`tb_rol_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_rol_usuario_tb_usuario1` FOREIGN KEY (`tb_usuario_id`) REFERENCES `tb_usuario` (`tb_usuario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_rol_usuario
-- ----------------------------

-- ----------------------------
-- Table structure for tb_ubigeo
-- ----------------------------
DROP TABLE IF EXISTS `tb_ubigeo`;
CREATE TABLE `tb_ubigeo` (
  `tb_ubigeo_id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(80) DEFAULT NULL,
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT CURRENT_TIMESTAMP,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  PRIMARY KEY (`tb_ubigeo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_ubigeo
-- ----------------------------

-- ----------------------------
-- Table structure for tb_usuario
-- ----------------------------
DROP TABLE IF EXISTS `tb_usuario`;
CREATE TABLE `tb_usuario` (
  `tb_usuario_id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `en_sesion` int(11) DEFAULT '0' COMMENT '1: Está en sesion\n0: No está en sesión',
  `activo` int(11) NOT NULL DEFAULT '1',
  `usu_reg` varchar(45) NOT NULL,
  `fec_reg` datetime DEFAULT NULL,
  `usu_modif` varchar(45) DEFAULT NULL,
  `fec_modif` datetime DEFAULT NULL,
  `tb_empleado_id` int(11) NOT NULL,
  PRIMARY KEY (`tb_usuario_id`),
  UNIQUE KEY `usuario_UNIQUE` (`usuario`),
  KEY `fk_tb_usuario_tb_empleado1_idx` (`tb_empleado_id`),
  CONSTRAINT `fk_tb_usuario_tb_empleado1` FOREIGN KEY (`tb_empleado_id`) REFERENCES `tb_empleado` (`tb_empleado_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_usuario
-- ----------------------------
