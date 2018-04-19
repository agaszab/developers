INSERT INTO developers.developer (id, nazwa, opis, url, developer_info_id) VALUES ('1', 'Dev1', 'jakis tam dev', 'http://www.dev1.pl', '1');
INSERT INTO developers.developer (id, nazwa, opis, url, developer_info_id) VALUES ('2', 'Dev2', 'opis dev', 'http://dev2.pl', '2');
INSERT INTO developers.developer (id, nazwa, opis, url, developer_info_id) VALUES ('3', 'Dev1', 'jakis tam dev', 'http://www.dev3.pl', '3');
INSERT INTO developers.developer (id, nazwa, opis, url, developer_info_id) VALUES ('4', 'Dev2', 'opis dev', 'http://dev4.pl', '4');

INSERT INTO developers.developer_info (id, adres, nip, regon) VALUES ('1', 'Wroclaw Drobnera 12', '3242', '423');
INSERT INTO developers.developer_info (id, adres, nip, regon) VALUES ('2', 'Wroclaw Pomorska 55', '23442', '232');
INSERT INTO developers.developer_info (id, adres, nip, regon) VALUES ('3', 'Gdynia Prosta 12', '3242', '423');
INSERT INTO developers.developer_info (id, adres, nip, regon) VALUES ('4', 'Szczecin Krucza 55', '23442', '232');

INSERT INTO developers.inwestycja (id, data_ukonczenia, miasto, nazwa, nr_domu, opis, ulica, url, id_dev) VALUES ('1', '2018-12-02', 'Poznan', 'Biurowiec', '342', 'wybudowac biurowiec', 'Wielka', 'http://ww.docadf.pl', '1');
INSERT INTO developers.inwestycja (id, data_ukonczenia, miasto, nazwa, nr_domu, opis, ulica, url, id_dev) VALUES ('2', '2018-11-02', 'Gdynia', 'Plac zabaw', '34', 'dsafs', 'Zielona', 'http://dasf.sfda.pl', '2');
INSERT INTO developers.inwestycja (id, data_ukonczenia, miasto, nazwa, nr_domu, opis, ulica, url, id_dev) VALUES ('3', '2018-12-02', 'Krosno', 'Biurowiec', '342', 'wybudowac biurowiec', 'Wielka', 'http://ww.docadf.pl', '3');
INSERT INTO developers.inwestycja (id, data_ukonczenia, miasto, nazwa, nr_domu, opis, ulica, url, id_dev) VALUES ('4', '2018-11-02', 'Lublin', 'szpital', '3df', 'erafa fasdfs asf', 'Dluga', 'http://dasf.sdaf.pl', '2');
/*
INSERT INTO developers.oferta (id, cena, ile_pokoi, metraz, opis, pietro, promocja, status, url_planu, id_inwest) VALUES ('1', '5434', '4', '150', 'fsfsf ', '1', 'false', 'ZAREZERWOWANE', 'http://asdfa', '2');
INSERT INTO developers.oferta (id, cena, ile_pokoi, metraz, opis, pietro, promocja, status, url_planu, id_inwest) VALUES ('2', '22344', '1', '80', 'sdfasfsafgsdgs ', '3', 'true', 'ZAREZERWOWANE', 'http://dsaf.dsaf', '3');
INSERT INTO developers.oferta (id, cena, ile_pokoi, metraz, opis, pietro, promocja, status, url_planu, id_inwest) VALUES ('3', '5434', '4', '150', 'fsffdas asdf asdsf ', '1', 'false', 'ZAREZERWOWANE', 'http://asdfa', '2');
INSERT INTO developers.oferta (id, cena, ile_pokoi, metraz, opis, pietro, promocja, status, url_planu, id_inwest) VALUES ('4', '22344', '5', '80', 'sdfadsfdasgsdgs ', '3', 'true', 'ZAREZERWOWANE', 'http://dsaf.dsaf', '3');
*/