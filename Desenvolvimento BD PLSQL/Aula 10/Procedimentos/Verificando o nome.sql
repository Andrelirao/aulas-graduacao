-- Executando o procedimento verificar_nome
DECLARE
  V_NOME ALUNO.NOME%TYPE;
BEGIN 
  VERIFICAR_NOME('82100280473    ', V_NOME);
  
  dbms_output.put_line('O nome associado ao RA � ' || V_NOME);
END;