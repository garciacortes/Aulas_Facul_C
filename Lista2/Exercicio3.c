#include <stdlib.h>
#include <stdio.h>

int main() {
    float Nota1, Nota2, Nota3, Ponderada, Peso1, Peso2, Peso3;

    system("cls");

    printf("digite a Nota 1: ");
    scanf("%f", &Nota1);
    printf("digite a Nota 2: ");
    scanf("%f", &Nota2);
    printf("digite a Nota 3: ");
    scanf("%f", &Nota3);
    Peso1 = Nota1 * 1;
    Peso2 = Nota2 * 2;  
    Peso3 = Nota3 * 3;
    Ponderada = ((Peso1 + Peso2 + Peso3) / 6);

    if(Peso1 > Peso2 && Peso1 > Peso3){
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Nota1, Nota2, Nota3, Ponderada);
        printf("A Nota 1 (%.2f) e a maior nota apos o Calculo do Peso 1 (%.2f).", Nota1, Peso1);
    }
    else if(Peso2 > Peso1 && Peso2 > Peso3){
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Nota1, Nota2, Nota3, Ponderada);
        printf("A Nota 2 (%.2f) e a maior nota apos o Calculo do Peso 2 (%.2f).", Nota2, Peso2);
    }
    else if(Peso3 > Peso1 && Peso3 > Peso2){
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Nota1, Nota2, Nota3, Ponderada);
        printf("A Nota 3 (%.2f) e a maior nota apos o Calculo do Peso 3 (%.2f).", Nota3, Peso3);
    }
    else if(Peso1 == Peso2 && Peso1 > Peso3) {
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Nota1, Nota2, Nota3, Ponderada);
        printf("As Notas 1 (%.2f) e 2 (%.2f) foram as maiores notas apos o calculo do peso 1 (%.2f) e peso 2 (%.2f)", Nota1, Nota2, Peso1, Peso2);
    }
    else if(Peso1 == Peso3 && Peso1 > Peso2) {
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Nota1, Nota2, Nota3, Ponderada);
        printf("As Notas 1 (%.2f) e 3 (%.2f) foram as maiores notas apos o calculo do peso 1 (%.2f) e peso 3 (%.2f)", Nota1, Nota3, Peso1, Peso3);
    }
    else if(Peso2 == Peso3 && Peso2 > Peso1) {
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Nota1, Nota2, Nota3, Ponderada);
        printf("As Notas 2 (%.2f) e 3 (%.2f) foram as maiores notas apos o calculo do peso 2 (%.2f) e peso 3 (%.2f)", Nota2, Nota3, Peso2, Peso3);
    }
    else {
        printf("\nA Media Ponderada das Notas %.2f, %.2f, %.2f sera: %.2f.\n", Nota1, Nota2, Nota3, Ponderada);
        printf("As tres Notas foram iguais.");
    }

    return 0;
}