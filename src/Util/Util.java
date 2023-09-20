/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Model.Produtos;
import Model.Vendas;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NEX
 */
public class Util {

    public static int obtemNum(String texto) {
        Pattern pattern = Pattern.compile("\\d+");

        // Criar um objeto Matcher
        Matcher matcher = pattern.matcher(texto);

        // Concatenar os números encontrados em uma única sequência
        StringBuilder numeros = new StringBuilder();
        while (matcher.find()) {
            numeros.append(matcher.group());
        }

        return Integer.parseInt(numeros.toString().equals("") ? "0" : numeros.toString());

    }

    public static LocalDate converterData(String data) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, formatter);

    }

    public static String converterData(LocalDate localDate) {
        // Definir o padrão de formatação desejado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Converter LocalDate para String formatada
        return localDate.format(formatter);

    }

    /* public static Date converterData (LocalDate localDate){
        
   }*/
    public static LocalDate converterData(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1; // Mês começa em 0, então adicionamos 1
        int ano = calendar.get(Calendar.YEAR);

        return LocalDate.of(ano, mes, dia);

    }

    public static boolean verficarNumnoTexto(String texto) {
        int numero = obtemNum(texto);
        return numero == 0;
    }

    public static String converterValorBigDecimalparaValorMonetario(BigDecimal valor) {

        // Criar uma instância de NumberFormat para o Brasil
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        // Formatar o valor BigDecimal como um valor monetário brasileiro
        String valorFormatado = formatador.format(valor);

        // Imprimir o valor formatado
        // System.out.println(valorFormatado);
        return valorFormatado;
    }

    public static String converterValorBigDecimalparaValorMonetarioNegativo(BigDecimal valor) {
        String valor1 = converterValorBigDecimalparaValorMonetario(valor);
        if (valor1.contains("-")) {
            return valor1.replace("-R$", "R$ -");

        }

        return valor1;

    }

    public static String converterPreco(BigDecimal preco) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        DecimalFormat decimalFormat = new DecimalFormat("R$ ###,###.##", symbols);
        decimalFormat.setParseBigDecimal(true);

        return decimalFormat.format(preco == null ? new BigDecimal("0") : preco);
    }

    public static String converterPrecoBD(String valueSTR) {
        valueSTR = valueSTR.replace(".", "").replace(",", "").replace("R$", "");

        return valueSTR;
    }

    public static Produtos buscarProdutos(int id, ArrayList<Produtos> listarProdutos) {
        Produtos produtos = null;
        for (Produtos produto : listarProdutos) {

            if (produto.getId() == id) {
                produtos = produto;
                return produtos;
            }

        }
        return produtos;

    }

    public static BigDecimal converteValue(String value) {
        String rs = value.replaceAll("[^\\d]", "");
        return new BigDecimal(rs).divide(new BigDecimal(100));
    }

    public static void main(String[] args) {
        BigDecimal bg = new BigDecimal("5002582");
        System.out.println(converterPreco(bg));
    }

    public static Vendas buscarVendas(int id, ArrayList<Vendas> listarVendas) {
        Vendas vendas = null;
        for (Vendas venda : listarVendas) {

            if (vendas.getId() == id) {
                vendas = venda;
                return vendas;
            }

        }
        return vendas;

    }

}
