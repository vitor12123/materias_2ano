import pandas as pd

df = pd.read_csv()
df.head(5)

df.shape
# retorna (x,y) x = quantidade de linha, y = quantidade de colunas

df["publico_estimado"].describle()
#

df.info()
# retorna as colunas e seus respectivos nomes, retorna quantos valores nulos ele tem e tipo dos dados

mediaCerveja = df.grupby("bairro")["preco_cerveja_latao"].mean()
# 

perigo = df.sort_values("ocorrencias_celular_hr", ascending=False).head(5)
perigo[ ["nome","bairro","ocorrencias_celular_hr"] ]

roubos = df.copy()
roubos = roubos[ roubos["ocorrencias_celular_hr"] > 0]
roubos["publico_por_roubo"] = roubos["publico_estimado"]/roubos["ocorrencias_celular_hr"]
roubos = roubos.sort_values("publico_por_roubo", ascending=True)
#

bom_barato = df[(df["preco_cerveja_latao"] < 10) & (df["prob_chuva"] < 10)]

#

df["nivel_banheiro"].value_counts(normalize=True) * 100
# pega a quantidade e separa por qualificação



