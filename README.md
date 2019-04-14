# testtask-operators-web-service
Test Task. Search method for repository of operators

## Requirements
- IDE IntelliJ IDEA2017
- Java 7 or above

## Task
It is required to develop web servce. It should search data in database.

### Data format:
- Request:
  ```
  {
      "snils": "108-003-636 06"
  }
  ```
- Response:
  ```
  {
    "success" : true,
    "description" : "Операция выполнена успешно",
    "id" : 2222,
    "surname" : "Хвостова",
    "name" : "Екатерина",
    "patronymic" : "Юрьевна",
    "position" : "Оператор",
    "branch" : "Уполномоченный МФЦ"
  }
  ```

### Database (Transact-SQL):
```
CREATE TABLE [dbo].[operators](
	[id_operator] [int] NOT NULL,
	[Family] [varchar](50) NULL,
	[Name] [varchar](50) NULL,
	[Farth] [varchar](50) NULL,
	[pass] [varchar](50) NULL,
	[role] [smallint] NULL,
	[dp_FIO] [varchar](150) NULL,
	[logname] [varchar](50) NULL,
	[log_name] [varchar](50) NULL,
	[phone] [varchar](50) NULL,
	[DOB] [date] NULL,
	[picture] [varchar](255) NOT NULL,
	[passport] [varchar](50) NULL,
	[snils] [varchar](50) NULL,
	[no_visible] [tinyint] NULL,
	[id_otdel] [int] NOT NULL,
	[GlobalKey] [uniqueidentifier] NOT NULL,
	[position] [smallint] NOT NULL,
	[rabbit_status] [smallint] NULL,
	[date_last_update] [datetime] NULL,
	[Id_Otdel_Sync] [int] NULL,
 CONSTRAINT [PK_operators] PRIMARY KEY CLUSTERED 
(
	[id_operator] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[operators] ADD  CONSTRAINT [DF__operators__pictu__0587D3B6]  DEFAULT ('') FOR [picture]
GO

ALTER TABLE [dbo].[operators] ADD  CONSTRAINT [DF_operators_no_visible]  DEFAULT ((0)) FOR [no_visible]
GO

ALTER TABLE [dbo].[operators] ADD  CONSTRAINT [DF_operators_id_otdel]  DEFAULT ((186)) FOR [id_otdel]
GO

ALTER TABLE [dbo].[operators] ADD  CONSTRAINT [DF__operators__Globa__43A1D464]  DEFAULT (newsequentialid()) FOR [GlobalKey]
GO

ALTER TABLE [dbo].[operators] ADD  DEFAULT ((0)) FOR [position]
GO

ALTER TABLE [dbo].[operators] ADD  DEFAULT (getdate()) FOR [date_last_update]
GO
```
