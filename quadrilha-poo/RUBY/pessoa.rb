class Pessoa
    attr_accessor :nome, :genero, :amores
    
    def initialize(nome, genero)
      @nome = nome
      @genero = genero
      @amores = []
    end
    
    def add_amor(pessoa)
      @amores << pessoa
    end
    
    def get_amadas
      amores.select { |pessoa| pessoa.genero == "feminino" }
    end
    
    def get_amados
      amores.select { |pessoa| pessoa.genero == "masculino" }
    end
    
    def to_s
      str = nome
      if amores.length > 0
        str += " que amava"
        amores.each_with_index do |pessoa, index|
          str += " #{pessoa.nome}"
          str += "," unless index == amores.length - 1
        end
      end
      str += "|"
      str
    end
    
    def ==(other)
      nome == other.nome
    end
    
    def hash
      nome.hash
    end
  end