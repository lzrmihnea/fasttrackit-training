drop table students;
create table students (
                          id bigserial,
                          firstname varchar(50),
                          lastname varchar(50),
                          date_of_birth date,

                          constraint id_pk primary key (id)
);


select * from students;

drop table exam_result ;

create table exam_result (
                             id bigserial,
                             subject varchar(100),
                             name varchar(100),
                             mark int,
                             student_id bigint,

                             primary key (id) ,
                             foreign key (student_id) references students(id)
)

select * from exam_result ;
select * from students;
insert into exam_result (subject, name, mark, student_id) values('Mate', 'Teza', 6, 1);
insert into exam_result (subject, name, mark, student_id) values('Romana', 'Teza', 8, 1);
insert into exam_result (subject, name, mark, student_id) values('Engleza', 'Teza', 10, 1);
insert into exam_result (subject, name, mark, student_id) values('Mate', 'Teza', 7, 5);
insert into exam_result (subject, name, mark, student_id) values('Mate', 'Teza', 8, 3);
insert into exam_result (subject, name, mark, student_id) values('Mate', 'Teza', 6, 4);

select * from students s join exam_result er on er.student_id=s.id order by s.lastname, s.firstname;


