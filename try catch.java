try {
    statement 1;
    statement 2;
    statement 3;
}

//Will run (1-3) if there is no errors

catch(<error object variable declaration>) {
    statement 4;
    statement 5;
}

//if there is error at (2) then it will jump to statements (4 and 5)