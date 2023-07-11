:- discontiguous amava/2.

aventureira(dora).
aventureira(botas).

amava(carlos, dora).
amava(dora, lia).
amava(lia, léa).
amava(léa, paulo).
amava(paulo, juca).
amava(juca, dora).
amava(dora, carlos).
amava(carlos, dora).
amava(dora, rita).
amava(rita, dito).
amava(dito, rita).
amava(rita, carlos).
amava(carlos, dora).
amava(dora, pedro).
amava(pedro, filha).
amava(filha, carlos).
amava(carlos, dora).

amava(dora, carlos).
amava(dora, lia).
amava(dora, léa).
amava(dora, paulo).
amava(dora, juca).
amava(dora, rita).
amava(dora, dito).
amava(dora, pedro).
amava(dora, filha).

genero(carlos, masculino).
genero(dora, feminino).
genero(lia, feminino).
genero(léa, feminino).
genero(paulo, masculino).
genero(juca, masculino).
genero(rita, feminino).
genero(dito, masculino).
genero(pedro, masculino).
genero(filha, feminino).

amadas(Y, X) :- 
    amava(Y, X),
    genero(X, feminino).

amados(Y, X) :- 
    amava(Y, X),
    genero(X, maculino).