USE books;

INSERT INTO books.language(name) VALUES ('Български');
INSERT INTO books.language(name) VALUES ('English');
INSERT INTO books.language(name) VALUES ('Македониан');

INSERT INTO books.user(name, password, email, preferred_language) VALUES (
    'NeposlushnoKeksche',
    '123456',
    'neposlushnoto@gmail.com',
    1
  );
INSERT INTO books.user(name, password, email, preferred_language) VALUES (
    'mitkoiskatest',
    '12345678',
    'mitko@gmail.com',
    2
  );

INSERT INTO books.author(name, bio) VALUES (
    'George R. R. Martin',
    'Does not release book 6.'
  );
INSERT INTO books.author(name, bio) VALUES (
    'Patrick Ness',
    'Ne mu znam imeto na ae'
  );
INSERT INTO books.author(name, bio) VALUES (
    'J. R. Talkien',
    'Dead'
  );

INSERT INTO books.book(author_id, release_date, genre, cover_path) VALUES (
  1,
  now(),
  'Action',
  './cover.jpg'
);
INSERT INTO books.book(author_id, release_date, genre, cover_path) VALUES (
  2,
  now(),
  'Action',
  './cover.jpg'
);
INSERT INTO books.book(author_id, release_date, genre, cover_path) VALUES (
  3,
  now(),
  'Action',
  './cover.jpg'
);

INSERT INTO books.book_description(book_id, language_id, name, description, pages) VALUES (
  1,
  1,
  'Песен за огън и лед',
  'Не е излязла 6та',
  230
);
INSERT INTO books.book_description(book_id, language_id, name, description, pages) VALUES (
  1,
  2,
  'A Song of Ice and Fire',
  'Ne e izlqzla 6ta',
  200
);
INSERT INTO books.book_description(book_id, language_id, name, description, pages) VALUES (
  2,
  1,
  'Живия хаост',
  'Има правописна грешка в името',
  150
);
INSERT INTO books.book_description(book_id, language_id, name, description, pages) VALUES (
  3,
  3,
  'Пръстену у властелину',
  'Македония е българска.',
  1000
);


INSERT INTO books.read_list (user_id, book_id, status) VALUES (
  1,
  1,
  0
);
INSERT INTO books.read_list (user_id, book_id, status) VALUES (
  1,
  2,
  150
);
INSERT INTO books.read_list (user_id, book_id, status) VALUES (
  3,
  2,
  70
);

INSERT INTO books.comments (user_id, book_id, body, rating) VALUES (
  2,
  1,
  'good, brat',
  4.8
);
INSERT INTO books.comments (user_id, book_id, body, rating) VALUES (
  2,
  3,
  'suck, bro',
  0
);
INSERT INTO books.comments (user_id, book_id, body, rating) VALUES (
  1,
  1,
  'yes',
  4.3
);
INSERT INTO books.comments (user_id, book_id, body, rating) VALUES (
  2,
  3,
  'hate it, too long',
  1
);