require_relative 'pessoa'

class Quadrilha
  attr_accessor :pessoas
  
  def initialize(pessoas = [])
    @pessoas = pessoas
  end
  
  def amava(amante, amado)
    index_amante = pessoas.index(amante)
    index_amado = pessoas.index(amado)
    
    pessoas << amante unless index_amante
    index_amante = pessoas.index(amante)
    pessoas[index_amante].add_amor(amado)
    
    pessoas << amado unless index_amado
  end
  
  def generate_string(index_amores, pessoa, str)
    str ||= ""
    pessoa ||= pessoas[0]
    index_pessoa = pessoas.index(pessoa)
    index_amor_pessoa = index_amores[index_pessoa]
    
    if index_amor_pessoa == pessoa.amores.length
      str += "#{pessoa.nome} que amava toda a quadrilha."
    else
      index_amores[index_pessoa] += 1
      str += "#{pessoa.nome}\n que amava #{generate_string(index_amores, pessoa.amores[index_amor_pessoa], str)}"
    end
    str
  end
  
  def to_s
    index_amores = Array.new(pessoas.length, 0)
    if pessoas.length != 0
      generate_string(index_amores, nil, nil)
    else
      "Sem quadrilha"
    end
  end
end

