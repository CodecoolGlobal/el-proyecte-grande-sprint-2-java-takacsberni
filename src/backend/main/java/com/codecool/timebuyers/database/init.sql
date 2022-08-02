CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

DROP TABLE IF EXISTS public.userprofiles CASCADE;
CREATE TABLE public.userprofiles
(
    id          uuid  NOT NULL PRIMARY KEY,
    user_name    text    NOT NULL,
    password    text    NOT NULL,
    phone_number text    NOT NULL,
    email       text    NOT NULL,
    town        text    NOT NULL,
    user_status  text    NOT NULL,
    taskToNeed  text    NOT NULL,
    taskToTake  text    NOT NULL
--     rating      integer NOT NULL
);

INSERT INTO userprofiles
VALUES ('e7636f4e-1255-11ed-861d-0242ac120002',
        'Josh',
        'joshpass',
        203423111,
        'josh@gmail.com',
        'Budapest',
        'BOTH',
        'IKEA_ASSEMBLY, MOVE_BOXES_WITHOUT_CAR',
        'DOG_SITTING');


