package med.voll.api.medico;

//dentro do DTO devolve apenas os campos que vai ser devolvido para o frontend
public record DadosListagemMedico(Long id,String nome, String email, String crm, Especialidade especialidade) {
    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
