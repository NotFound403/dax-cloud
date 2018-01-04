create table router
(
  routerId varchar(64) not null
    primary key,
  serviceId varchar(32) not null comment '服务实例',
  url varchar(256) null comment '需要映射的url  跟serviceId只能配置一个',
  stripPrefix char default '1' not null comment '路由前缀是否在转发开始前被删除 默认是删除',
  path varchar(16) not null,
  retryable char default '0' null comment '是否支持重试  默认不支持',
  customSensitiveHeaders char default '0' null comment '开启敏感头列表 默认不开启',
  enable char default '1' null comment '是否可用  默认可用',
  constraint router_path_uindex
  unique (path)
)
  comment '路由参数配置' engine=InnoDB
;

create table sensitiveheader
(
  routerId varchar(64) not null
    primary key,
  header varchar(128) not null,
  enable char default '1' not null comment '是否可用   默认可用'
)
  comment '路由敏感头配置' engine=InnoDB
;

