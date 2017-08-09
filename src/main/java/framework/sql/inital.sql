-- drop table `users`

CREATE TABLE `users` (
  `userid` int(20) UNSIGNED NOT NULL,
  `fullname` varchar(100) COLLATE utf8_bin NOT NULL,
  `gender` int(1) UNSIGNED ,
  `state` varchar(50) COLLATE utf8_bin NOT NULL  default 0,
  `city` varchar(50) COLLATE utf8_bin,
  `street` varchar(50) COLLATE utf8_bin,
  `zipcode` int(5) UNSIGNED ,
  `birthyear` int(4) UNSIGNED ,
  `email` varchar(100) COLLATE utf8_bin NOT NULL,
  `password` varchar(50) COLLATE utf8_bin NOT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `dateupdated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `users` (`userid`, `fullname`, `gender`, `state`, `city`, `street`, `zipcode`, `birthyear`, `email`, `password`, `datecreated`, `dateupdated`) VALUES
(1, 'Alice A', 0, 'FL', 'Miami', '1 St', 31200, 1998, 'aa', 'aa', '2017-03-18 16:32:11', '2017-03-18 16:32:11'),
(2, 'Bily B', 1, 'IL', 'Chicago', '2 St', 41500, 1991, 'bb', 'bb', '2017-03-18 16:32:41', '2017-03-18 16:32:41'),
(3, 'Cindy C', 0, 'NY', 'NYC', '26 Ave', 12110, 1980, 'cc', 'cc', '2017-03-18 16:33:11', '2017-03-18 16:33:11'),
(4, 'David D', 1, 'CA', 'San Jose', '59 St', 21000, 1999, 'dd', 'dd', '2017-03-18 16:33:44', '2017-03-18 16:33:44'),
(5, 'Elena E', 0, 'NC', 'Charlotte', '51 St', 35498, 1980, 'ee', 'ee', '2017-03-18 16:34:18', '2017-03-18 16:34:18');

ALTER TABLE `users`
  ADD PRIMARY KEY (`userid`);
ALTER TABLE `users`
  MODIFY `userid` int(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
 

CREATE TABLE `permission` (
  `permissionid` int(20) UNSIGNED NOT NULL,
  `permissioncode` varchar(100) COLLATE utf8_bin NOT NULL,
  `permissionname` varchar(100) COLLATE utf8_bin NOT NULL,
  `description` varchar(100)  COLLATE utf8_bin ,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `dateupdated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
ALTER TABLE `permission`
  ADD PRIMARY KEY (`permissionid`);
ALTER TABLE `permission`
  MODIFY `permissionid` int(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
 
INSERT INTO `permission` (`permissionid`, `permissioncode`, `permissionname`,`description` ) VALUES
(1, 'BankMainWindow.Menu1.Item11', 'Add Company Customer', 'Add Company Customer'),
(2, 'BankMainWindow.Menu1.Item12', 'Add Person Customer', 'Add Person Customer'),
(3, 'BankMainWindow.Menu1.Item13', 'Show Customers List', 'Show Customers List'),
(4, 'BankMainWindow.Menu2.Item21', 'Create An Account', 'Create An Account'),
(5, 'BankMainWindow.Menu2.Item22', 'Add Interest', 'Add Interest'),
(6, 'BankMainWindow.Menu2.Item23', 'Display Accounts List', 'Display Accounts List'),
(7, 'BankMainWindow.Menu3.Item31', 'Display User', 'Display User'),
(8, 'BankMainWindow.Menu3.Item32', 'Add User', 'Add User'),
(9, 'BankMainWindow.Menu3.Item33', 'Manage Permission', 'Manage Permission'),
(10, 'BankMainWindow.Menu4.Item43', 'Exit', 'Exit');
 
 
 
CREATE TABLE userpermission (
        userpermissionid int(20) unsigned NOT NULL AUTO_INCREMENT, 
        permissionid int(20) unsigned NOT NULL, 
        userid int(20) unsigned, 
        roleid int(20) unsigned, 
        datecreated timestamp DEFAULT CURRENT_TIMESTAMP, 
        dateupdated timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
        PRIMARY KEY (userpermissionid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into userpermission(permissionid,userid) value(1,4);
insert into userpermission(permissionid,userid) value(2,4);
insert into userpermission(permissionid,userid) value(3,4);
insert into userpermission(permissionid,userid) value(4,4);
insert into userpermission(permissionid,userid) value(5,4);