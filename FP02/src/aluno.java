public class aluno {
    int id;
    String nome;
    String curso;
    String contacto;

    public aluno(){
        id = 0;
        nome = "John Doe";
        curso = "Engenharia Informatica";
        contacto = "112";
    }

    public aluno(int i, String n, String c, String con){
        id = i;
        nome = n;
        curso = c;
        contacto = con;
    }

    int getID(){
        return id;
    }
    void setID(int id){
        this.id = id;
    }
    String getNome(){
        return nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    String getCurso(){
        return curso;
    }
    void setCurso(String curso){
        this.curso = curso;
    }
    String getContacto(){
        return contacto;
    }
    void setContacto(String contacto){
        this.contacto = contacto;
    }

    boolean equals(int id){
        if (this.id == id)
            return true;
        return false;
    }
    boolean equals(String nome){
        if (this.nome == nome)
            return true;
        return false;
    }

    boolean equals(aluno a){
        if(a.id == this.id && a.nome == this.nome && a.curso == this.curso && a.contacto == this.contacto)
            return true;
        return false;
    }

    String tostring(){
        return ("O aluno número " + id + ", com o nome " + nome + ", estuda " + curso + " e pode ser contactado por " + contacto + "\n");
    }
}
