create table tb_sales (id int8 generated by default as identity, amount float8, date date, deals int4, visited int4, seller_id int8, primary key (id));
create table tb_sellers (id int8 generated by default as identity, name varchar(255), primary key (id));
alter table if exists tb_sales add constraint FKp0nn0oixeiw2fq3jivj6vnsu foreign key (seller_id) references tb_sellers;



postgres://

usr=umkrhgkkrnyxcf
pwd=ff763d4701c0f8e5138335490def174b96c40b6913c55dc5ea026b69965f08a6
@Host=ec2-34-206-8-52.compute-1.amazonaws.com
:porta=5432
/db=dd0lhdt95pe918