require_relative 'quadrilha'

carlos = Pessoa.new("Carlos", "masculino")
dora = Pessoa.new("Dora", "feminino")
lia = Pessoa.new("Lia", "feminino")
lea = Pessoa.new("Léa", "feminino")
paulo = Pessoa.new("Paulo", "masculino")
juca = Pessoa.new("Juca", "masculino")
rita = Pessoa.new("Rita", "feminino")
dito = Pessoa.new("Dito", "masculino")
pedro = Pessoa.new("Pedro", "masculino")
tanto = Pessoa.new("tanto", "masculino")
filha = Pessoa.new("a Filha", "feminino")

quadrilha = Quadrilha.new
quadrilha.amava(carlos, dora)
quadrilha.amava(dora, lia)
quadrilha.amava(lia, lea)
quadrilha.amava(lea, paulo)
quadrilha.amava(paulo, juca)
quadrilha.amava(juca, dora)
quadrilha.amava(dora, carlos)
quadrilha.amava(carlos, dora)
quadrilha.amava(dora, rita)
quadrilha.amava(rita, dito)
quadrilha.amava(dito, rita)
quadrilha.amava(rita, dito)
quadrilha.amava(dito, rita)
quadrilha.amava(rita, carlos)
quadrilha.amava(carlos, dora)
quadrilha.amava(dora, pedro)
quadrilha.amava(pedro, tanto)
quadrilha.amava(tanto, filha)
quadrilha.amava(filha, carlos)
quadrilha.amava(carlos, dora)
quadrilha.amava(carlos, dora)

puts quadrilha
puts ""
quadrilha.pessoas.each { |pessoa| puts pessoa }