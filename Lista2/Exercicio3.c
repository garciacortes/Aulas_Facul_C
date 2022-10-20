#include <stdlib.h>
#include <stdio.h>
#include <iso646.h>

float VetorPos(float Notas[3], float Pesos[3]) {
    float CopiarNotas[2], CopiarPesos[2];

    CopiarNotas[0] = Notas[1];
    CopiarNotas[1] = Notas[2];
    Notas[2] = Notas[0];
    Notas[1] = CopiarNotas[1];
    Notas[0] = CopiarNotas[0];
    CopiarPesos[0] = Pesos[1];
    CopiarPesos[1] = Pesos[2];
    Pesos[2] = Pesos[0];
    Pesos[0] = CopiarPesos[0];
    Pesos[1] = CopiarPesos[1];

    return Notas[3], Pesos[3];
}

int VerificarPeso(float PesoA, float PesoB, float PesoC, float Notas[3], float Ponderada, int NotPass, int Posicao) {
    if (PesoA > PesoB and PesoA > PesoC) {
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Notas[0], Notas[1], Notas[2], Ponderada);
        printf("A Nota %d (%.2f) e a maior nota apos o Calculo do Peso %d (%.2f).", Posicao, Notas[0], Posicao, PesoA);
        return NotPass = 1;
    }
    else if (PesoA == PesoB and PesoA > PesoC) {
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Notas[0], Notas[1], Notas[2], Ponderada);
        printf("As Notas 1 (%.2f) e 2 (%.2f) foram as maiores notas apos o calculo do peso 1 (%.2f) e peso 2 (%.2f)", Notas[0], Notas[1], PesoA, PesoB);
    }
    else {
        return NotPass;
    }
}

int main() {
    float Notas[3], Ponderada, Pesos[3];
    int NotPass, i, x, Posicao;

    system("cls");
    x = 1;
    for (i = 0; i < 3; i++) {
        printf("digite as Tres Notas, 1 por vez: ");
        scanf("%f", &Notas[i]);
        Pesos[i] = Notas[i] * x;
        x++;
        Ponderada = Ponderada + Pesos[i];
    }
    Ponderada = Ponderada / 6;

    Posicao = 1;
    while (1) {
        NotPass = VerificarPeso(Pesos[0], Pesos[1], Pesos[2], Notas, Ponderada, 0, Posicao);
        if (NotPass == 0) {
            Posicao++;
            VetorPos(Notas, Pesos);
        }
        else {
            break;
        }
    }

    /*
    else {
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Nota1, Nota2, Nota3, Ponderada);
        printf("As tres Notas foram iguais.");
    }*/

    return 0;
}