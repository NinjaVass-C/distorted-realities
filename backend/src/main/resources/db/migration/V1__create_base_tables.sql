CREATE TABLE `user` (
                        `account_active` bit(1) NOT NULL,
                        `role` tinyint DEFAULT NULL,
                        `created_at` datetime(6) DEFAULT NULL,
                        `deleted_at` datetime(6) DEFAULT NULL,
                        `id` bigint NOT NULL,
                        `updated_at` datetime(6) DEFAULT NULL,
                        `email` varchar(255) DEFAULT NULL,
                        `first_name` varchar(255) DEFAULT NULL,
                        `hashed_password` varchar(255) DEFAULT NULL,
                        `last_name` varchar(255) DEFAULT NULL,
                        `username` varchar(255) DEFAULT NULL,
                        PRIMARY KEY (`id`),
                        CONSTRAINT `user_chk_1` CHECK ((`role` between 0 and 2))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `entry` (
                         `approval_status` bit(1) DEFAULT NULL,
                         `approver_id` bigint DEFAULT NULL,
                         `author_id` bigint DEFAULT NULL,
                         `created_at` datetime(6) DEFAULT NULL,
                         `deleted_at` datetime(6) DEFAULT NULL,
                         `id` bigint NOT NULL,
                         `updated_at` datetime(6) DEFAULT NULL,
                         `content` varchar(255) DEFAULT NULL,
                         `title` varchar(255) DEFAULT NULL,
                         PRIMARY KEY (`id`),
                         KEY `FKnx6vbhqnq1y4ch3juxn8rhtj3` (`approver_id`),
                         KEY `FKnassgy123r6f7didgro7gpv2r` (`author_id`),
                         CONSTRAINT `FKnassgy123r6f7didgro7gpv2r` FOREIGN KEY (`author_id`) REFERENCES `user` (`id`),
                         CONSTRAINT `FKnx6vbhqnq1y4ch3juxn8rhtj3` FOREIGN KEY (`approver_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

