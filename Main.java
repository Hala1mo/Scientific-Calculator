package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			GridPane g = new GridPane();
			g.setVgap(5);
			g.setAlignment(Pos.CENTER);

			HBox h = new HBox();
			h.setSpacing(5);

			TextField x = new TextField();
			x.setFont(Font.font(15));

			x.setPrefWidth(520);
			x.setPrefHeight(80);
			h.getChildren().addAll(x);
			g.add(h, 0, 1);

			HBox h0 = new HBox();
			h.setSpacing(5);

			TextField x2 = new TextField();
			x2.setFont(Font.font(15));

			x2.setPrefWidth(520);
			x2.setPrefHeight(80);
			h0.getChildren().addAll(x2);
			g.add(h0, 0, 2);

			HBox h100 = new HBox();
			h100.setSpacing(5);

			TextField x3 = new TextField();
			x3.setFont(Font.font(15));
			x3.setPrefWidth(520);
			x3.setPrefHeight(50);
			h100.getChildren().addAll(x3);
			g.add(h100, 0, 3);

			HBox h1 = new HBox();
			Button sin = new Button("sin");

			sin.setStyle("-fx-background-color:DODGERBLUE; ");
			sin.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			sin.setPrefWidth(70);

			Button cos = new Button("cos");
			cos.setStyle("-fx-background-color:DODGERBLUE; ");
			cos.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			cos.setPrefWidth(70);

			Button tan = new Button("tan");
			tan.setStyle("-fx-background-color:DODGERBLUE; ");
			tan.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			tan.setPrefWidth(70);

			Button pLeft = new Button("(");
			pLeft.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			pLeft.setPrefWidth(70);

			Button pRight = new Button(")");
			pRight.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			pRight.setPrefWidth(70);

			Button fuc = new Button("!");
			fuc.setStyle("-fx-background-color:DODGERBLUE; ");
			fuc.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			fuc.setPrefWidth(70);

			Button off = new Button("OFF");
			off.setStyle("-fx-background-color:DODGERBLUE; ");
			off.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			off.setPrefWidth(70);
			h1.setSpacing(5);
			h1.getChildren().addAll(sin, cos, tan, pLeft, pRight, fuc, off);
			g.add(h1, 0, 6);

			HBox h2 = new HBox();
			Button pi = new Button("π");
			pi.setStyle("-fx-background-color:DODGERBLUE; ");
			pi.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			pi.setPrefWidth(70);
			Button pow = new Button("y^x");
			pow.setStyle("-fx-background-color:DODGERBLUE; ");
			pow.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			pow.setPrefWidth(70);
			Button seven = new Button("7");
			seven.setStyle("-fx-background-color:GRAY; ");
			seven.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			seven.setPrefWidth(70);

			Button eight = new Button("8");
			eight.setStyle("-fx-background-color:GRAY; ");
			eight.setPrefWidth(70);
			eight.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			Button nine = new Button("9");
			nine.setStyle("-fx-background-color:GRAY; ");
			nine.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			nine.setPrefWidth(70);

			Button div = new Button("÷");
			div.setStyle("-fx-background-color:DIMGRAY; ");
			div.setPrefWidth(70);
			div.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			Button sub = new Button("(-)");
			sub.setStyle("-fx-background-color:DIMGRAY; ");
			sub.setPrefWidth(70);
			sub.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			h2.getChildren().addAll(pi, pow, seven, eight, nine, div, sub);
			h2.setSpacing(5);
			g.add(h2, 0, 7);

			HBox h3 = new HBox();
			Button square = new Button("x²");
			square.setStyle("-fx-background-color:DODGERBLUE; ");
			square.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			square.setPrefWidth(70);

			Button root = new Button("√");
			root.setStyle("-fx-background-color:DODGERBLUE; ");
			root.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			root.setPrefWidth(70);
			Button four = new Button("4");
			four.setStyle("-fx-background-color:GRAY; ");
			four.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			four.setPrefWidth(70);

			Button five = new Button("5");
			five.setPrefWidth(70);
			five.setStyle("-fx-background-color:GRAY; ");
			five.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			Button six = new Button("6");
			six.setStyle("-fx-background-color:GRAY; ");
			six.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			six.setPrefWidth(70);

			Button mul = new Button("x");
			mul.setStyle("-fx-background-color:DIMGRAY; ");
			mul.setPrefWidth(70);
			mul.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			Button ca = new Button("CA");
			ca.setStyle("-fx-background-color:ORANGERED; ");
			ca.setPrefWidth(70);
			ca.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			h3.getChildren().addAll(square, root, four, five, six, mul, ca);
			h3.setSpacing(5);
			g.add(h3, 0, 8);

			HBox h4 = new HBox();
			Button expo = new Button("eˣ");
			expo.setStyle("-fx-background-color:DODGERBLUE; ");
			expo.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			expo.setPrefWidth(70);

			Button ln = new Button("LN");
			ln.setStyle("-fx-background-color:DODGERBLUE; ");
			ln.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			ln.setPrefWidth(70);

			Button one = new Button("1");
			one.setStyle("-fx-background-color:GRAY; ");
			one.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			one.setPrefWidth(70);

			Button two = new Button("2");
			two.setStyle("-fx-background-color:GRAY; ");
			two.setPrefWidth(70);
			two.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			Button three = new Button("3");
			three.setStyle("-fx-background-color:GRAY; ");
			three.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			three.setPrefWidth(70);

			Button s = new Button("-");
			s.setStyle("-fx-background-color:DIMGRAY; ");
			s.setPrefWidth(70);
			s.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			Button C = new Button("C");
			// C.setTextFill(Color.ORANGERED);
			C.setStyle("-fx-background-color:ORANGERED; ");
			C.setPrefWidth(70);
			C.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			h4.getChildren().addAll(expo, ln, one, two, three, s, C);
			h4.setSpacing(5);
			g.add(h4, 0, 9);

			HBox h5 = new HBox();
			Button log = new Button("LOG");
			log.setStyle("-fx-background-color:DODGERBLUE; ");
			log.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			log.setPrefWidth(70);

			Button div2 = new Button("1/x");
			div2.setStyle("-fx-background-color:DODGERBLUE; ");
			div2.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			div2.setPrefWidth(70);

			Button zero = new Button("0");
			zero.setStyle("-fx-background-color:GRAY; ");
			zero.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			zero.setPrefWidth(70);

			Button point = new Button(".");
			point.setPrefWidth(70);
			point.setFont(Font.font("Verdana", FontWeight.BOLD, 20));

			Button mod = new Button("%");
			mod.setStyle("-fx-background-color:DIMGRAY; ");
			mod.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			mod.setPrefWidth(70);

			Button plus = new Button("+");
			plus.setStyle("-fx-background-color:DIMGRAY; ");
			plus.setPrefWidth(70);
			plus.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			Button back = new Button("🡰");
			back.setStyle("-fx-background-color:ORANGERED; ");
			back.setPrefWidth(70);
			back.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

			h5.getChildren().addAll(log, div2, zero, point, mod, plus, back);
			h5.setSpacing(5);
			g.add(h5, 0, 10);

			Button equal = new Button();
			equal.setText("=");

			equal.setStyle("-fx-background-color:DODGERBLUE; ");
			equal.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
			equal.setMinWidth(520);
			equal.setMinHeight(90);
			equal.setAlignment(Pos.CENTER);

			g.add(equal, 0, 11);

			ca.setOnAction(e -> {

				x.setText("");
				x2.setText("");
				x3.setText("");

			});
			sin.setOnAction(e -> {
				x.appendText(sin.getText() + " ");

			});

			cos.setOnAction(e -> {
				x.appendText(cos.getText() + " ");

			});

			tan.setOnAction(e -> {
				x.appendText(tan.getText() + " ");

			});

			pLeft.setOnAction(e -> {
				x.appendText(pLeft.getText() + " ");

			});

			pRight.setOnAction(e -> {
				x.appendText(" " + pRight.getText());

			});

			fuc.setOnAction(e -> {
				x.appendText(" " + fuc.getText());

			});

			off.setOnAction(e -> {
				System.exit(0);

			});
			pi.setOnAction(e -> {
				x.appendText("3.14" + " ");

			});

			pow.setOnAction(e -> {
				x.appendText(" " + "^" + " ");

			});
			seven.setOnAction(e -> {
				x.appendText(seven.getText());

			});

			eight.setOnAction(e -> {
				x.appendText(eight.getText());

			});

			nine.setOnAction(e -> {
				x.appendText(nine.getText());

			});
			six.setOnAction(e -> {
				x.appendText(six.getText());

			});

			five.setOnAction(e -> {
				x.appendText(five.getText());

			});
			four.setOnAction(e -> {
				x.appendText(four.getText());

			});
			three.setOnAction(e -> {
				x.appendText(three.getText());

			});
			two.setOnAction(e -> {
				x.appendText(two.getText());

			});
			one.setOnAction(e -> {
				x.appendText(one.getText());

			});
			zero.setOnAction(e -> {
				x.appendText(zero.getText());

			});
			div.setOnAction(e -> {
				x.appendText(" " + "/" + " ");

			});
			mul.setOnAction(e -> {
				x.appendText(" " + "*" + " ");

			});
			sub.setOnAction(e -> {
				x.appendText("-");

			});
			square.setOnAction(e -> {
				x.appendText(" " + square.getText() + " ");

			});

			root.setOnAction(e -> {
				x.appendText(root.getText() + " ");

			});

			log.setOnAction(e -> {
				x.appendText("log" + " ");

			});

			div2.setOnAction(e -> {
				x.appendText(div2.getText() + " ");

			});
			point.setOnAction(e -> {
				x.appendText(point.getText());

			});
			plus.setOnAction(e -> {
				x.appendText(" " + plus.getText() + " ");

			});
			mod.setOnAction(e -> {
				x.appendText(" " + mod.getText() + " ");

			});
			expo.setOnAction(e -> {
				x.appendText(expo.getText() + " ");

			});
			ln.setOnAction(e -> {
				x.appendText("ln" + " ");

			});
			square.setOnAction(e -> {
				x.appendText(square.getText() + " ");

			});
			s.setOnAction(e -> {
				x.appendText(" " + s.getText() + " ");

			});
			C.setOnAction(e -> {
				if (x.getText().lastIndexOf(" ") > 0) {
					x.setText(x.getText().substring(0, x.getText().lastIndexOf(" ")));
				} else if (x.getText().lastIndexOf(" ") < 0) {
					x.setText("");
				}

			});
			back.setOnAction(e -> {

				if (x.getText().length() > 0) {
					x.setText(x.getText().substring(0, x.getText().length() - 1));
				}

			});
			equal.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub

					String ans = "";
					double value = 0;
					CursorArrayStack<String> c = new CursorArrayStack<String>();
					// System.out.println(x.getText());
					if (CheckParenthesis(x.getText()) == 0) {
						String v = x.getText().replaceAll("  ", " ");
						String[] tokens = v.split(" ");

						for (int i = 0; i < tokens.length; i++) {
							tokens[i] = tokens[i].trim();

							if (ContainsNum(tokens[i]) && !tokens[i].equals("1/x")) {
								try {
									String x = NegativeNumber(tokens[i]);
									ans = ans + x + " ";
								} catch (NumberFormatException e) {
									x3.setText("Error");
								}

							} else if (tokens[i].compareTo("(") == 0) {
								c.push("(");
							} else if (tokens[i].compareTo(")") == 0) {
								while (!c.isEmpty() && c.peek().compareTo("(") != 0) {

									ans = ans + c.pop() + " ";

								}
								c.pop();
							} else if (tokens[i].equals("√") || tokens[i].equals("^") || tokens[i].equals("ln")
									|| tokens[i].equals("log") || tokens[i].equals("-ln") || tokens[i].equals("-log")
									|| tokens[i].equals("!") || tokens[i].equals("-sin") || tokens[i].equals("sin")
									|| tokens[i].equals("cos") || tokens[i].equals("-cos") || tokens[i].equals("tan")
									|| tokens[i].equals("-tan") || tokens[i].equals("tan") || tokens[i].equals("-tan")
									|| tokens[i].equals("eˣ") || tokens[i].equals("-eˣ")) {
								c.push(tokens[i]);

							} else {
								while (!c.isEmpty()
										&& (IsOperator(tokens[i]) <= (IsOperator((String.valueOf(c.peek())))))) {
									ans = ans + c.pop() + " ";

								}
								c.push(String.valueOf(tokens[i]));

							}
						}

						while (!c.isEmpty()) {

							if (c.peek().equals("(")) {
								x3.setText("Error:PLEASE WRITE THE EQUATION CORRCTLY!!!");
								x2.setText(" ");

								break;
							} else {
								ans += c.pop() + " ";
							}

						}

						if (CheckNulls(ans) == false) {
							x2.setText(ans);

							if (ans != "PLEASE WRITE THE EQUATION CORRCTLY!!!") {
								ans = ans.trim();
								String[] t = ans.split(" ");

								try {
									for (int i = 0; i < t.length; i++) {

										if (isNumeric(t[i])) {
											c.push(t[i]);

										} else if (IsOperator(String.valueOf(t[i])) != -1) {

											if (String.valueOf(t[i]).equals("sin")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												double x = Math.toRadians(num1);
												value = Math.sin(x);
												c.push(String.valueOf(value));
											} else if (String.valueOf(t[i]).equals("-sin")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												double x = Math.toRadians(num1);
												value = Math.sin(x) * -1;
												c.push(String.valueOf(value));
											} else if (String.valueOf(t[i]).equals("cos")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												double x = Math.toRadians(num1);
												value = Math.cos(x);
												c.push(String.valueOf(value));
											} else if (String.valueOf(t[i]).equals("-cos")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												double x = Math.toRadians(num1);
												value = Math.cos(x) * -1;
												c.push(String.valueOf(value));
											} else if (String.valueOf(t[i]).equals("tan")) {

												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												double x = Math.toRadians(num1);
												value = Math.tan(x);
												c.push(String.valueOf(value));

											} else if (String.valueOf(t[i]).equals("-tan")) {

												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												double x = Math.toRadians(num1);
												value = Math.tan(x) * -1;
												c.push(String.valueOf(value));

											} else if ((t[i].compareTo("x²")) == 0) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												value = Math.pow(num1, 2);
												c.push(String.valueOf(value));

											} else if ((t[i].compareTo("-x²")) == 0) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												value = Math.pow(num1, 2) * -1;
												c.push(String.valueOf(value));

											}

											else if (String.valueOf(t[i]).equals("log")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												if (num1 > 0) {
													value = Math.log10(num1);
													c.push(String.valueOf(value));
												} else {
													x3.setText("Error:Can't do log for a negative number!!!");
													x2.setText("");
													value = 0;

													c.push(String.valueOf(value));
												}

											} else if (String.valueOf(t[i]).equals("-log")) {

												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												if (num1 > 0) {
													value = Math.log10(num1) * -1;
													c.push(String.valueOf(value));
												} else {
													x3.setText("Error:Can't do log for a negative number!!!");
													x2.setText("");
													value = 0;

													c.push(String.valueOf(value));
												}
											} else if (String.valueOf(t[i]).equals("eˣ")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												value = Math.exp(num1);
												c.push(String.valueOf(value));

											} else if (String.valueOf(t[i]).equals("-eˣ")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												value = Math.exp(num1) * -1;
												c.push(String.valueOf(value));

											} else if (String.valueOf(t[i]).equals("√")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												value = Math.sqrt(num1);
												c.push(String.valueOf(value));

											} else if (String.valueOf(t[i]).equals("-√")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												value = Math.sqrt(num1) * -1;
												c.push(String.valueOf(value));

											} else if (String.valueOf(t[i]).compareToIgnoreCase("1/x") == 0) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												value = 1 / num1;
												c.push(String.valueOf(value));

											} else if (String.valueOf(t[i]).compareToIgnoreCase("-1/x") == 0) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												value = -1 / num1;
												c.push(String.valueOf(value));

											} else if (String.valueOf(t[i]).compareToIgnoreCase("ln") == 0) {

												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												if (num1 > 0) {
													value = Math.log(num1);
													c.push(String.valueOf(value));
												} else {
													x3.setText(
															"Error:The natural logarithm of a negative number is undefined!!!");
													x2.setText("");
													value = 0;

													c.push(String.valueOf(value));

												}

											} else if (String.valueOf(t[i]).compareToIgnoreCase("-ln") == 0) {

												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												if (num1 > 0) {
													value = Math.log(num1) * -1;
													c.push(String.valueOf(value));
												} else {
													x3.setText(
															"Error:The natural logarithm of a negative number is undefined!!!");
													x2.setText("");
													value = 0;

													c.push(String.valueOf(value));

												}
											} else if (String.valueOf(t[i]).equals("(-)")) {
												System.out.println("lll");
												double num1 = Double.parseDouble(String.valueOf(c.pop()));
												value = -1 * (num1);
												c.push(String.valueOf(value));

											} else if (String.valueOf(t[i]).equals("!")) {
												double num1 = Double.parseDouble(String.valueOf(c.pop()));

												if (isInteger(num1) == true) {
													value = fact((int) num1);

													c.push(String.valueOf(value));
												} else {
													x3.setText("Error:Can't do factorial for non integer number!!!");
													x2.setText("");
												}

											} else {
												try {
													double num2 = Double.parseDouble(String.valueOf(c.pop()));
													double num1 = Double.parseDouble(String.valueOf(c.pop()));

													switch (String.valueOf(t[i])) {
													case "+":
														value = num1 + num2;
														break;
													case "-":
														value = num1 - num2;
														break;
													case "*":
														value = num1 * num2;
														break;
													case "^":
														value = Math.pow(num1, num2);
														break;

													case "%":
														value = num1 % num2;
														break;
													case "/":
														if (num2 != 0)
															value = num1 / num2;
														else {
															x3.setText("Error:Divided by zero");
															value = 0;
														}
														break;

													}
													c.push(String.valueOf(value));

												} catch (NumberFormatException e2) {
													x3.setText("Error:PLEASE WRITE THE EQUATION CORRCTLY!!!");
													x2.setText("");

												}
											}

										}
									}
								} catch (NumberFormatException e2) {
									x3.setText("Error:PLEASE WRITE THE EQUATION CORRCTLY!!!");
									x2.setText("");

								}

								try {

									if (x3.getText().equals("Error:Can't do factorial for non integer number!!!")
											|| x3.getText().equals(
													"Error:The natural logarithm of a negative number is undefined!!!")
											|| x3.getText().equals("Error:Can't do log for a negative number!!!")) {

									} else {

										value = Double.parseDouble(String.valueOf(c.pop()));

										x3.setText(String.valueOf(value));
										x2.setText(ans);
									}
								} catch (NumberFormatException e2) {
									x3.setText("Error:PLEASE WRITE THE EQUATION CORRCTLY!!!");
									x2.setText("");

								}

							}

						}

					} else {
						x3.setText("Error:Missing parentheses!!!");

					}

				}

			});
			Scene scene = new Scene(g, 550, 600);
			g.setStyle("-fx-background-color:LIGHTBLUE");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calculator");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static long fact(int x) {

		if (x <= 1) {
			return 1;
		} else
			return x * fact(x - 1);

	}

	public static boolean isNumeric(String p) {

		try {
			double d = Double.parseDouble(p);
		} catch (NumberFormatException e) {

			return false;
		}

		return true;
	}

	public static int IsOperator(String ch) {
		switch (ch) {
		case "+":
		case "-":
			return 1;

		case "*":
		case "/":
		case "%":
			return 2;

		case "^":
		case "log":
		case "-log":
		case "ln":
		case "-ln":
		case "eˣ":
		case "-eˣ":
		case "x²":
		case "-x²":
		case "√":
		case "-√":
		case "1/x":
		case "-1/x":
		case "!":
		case "(-)":
			return 3;
		case "sin":
		case "-sin":
		case "cos":
		case "-cos":
		case "tan":
		case "-tan":
			return 4;
		}
		return -1;
	}

	public boolean CheckNulls(String ans) {

		String[] check = ans.split(" ");
		for (int k = 0; k < check.length; k++) {
			if (check[k].equals(null)) {
				return true;
			}

		}
		return false;
	}

	public static int CheckParenthesis(String ans) {
		String[] x = ans.split(" ");
		int countL = 0;
		int countR = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i].equals("(")) {
				countL++;
			} else if (x[i].equals(")")) {
				countR++;
			}
		}

		if ((countL + countR) % 2 == 0) {
			return 0;

		} else
			return -1;
	}

	boolean isInteger(double number) {
		return number % 1 == 0;
	}

	private boolean ContainsNum(String num) {

		for (int i = 0; i < num.length(); i++) {
			if (Character.isDigit(num.charAt(i)) == true) {
				return true;
			}

		}
		return false;
	}

	private String NegativeNumber(String num) {
		double x = 1;
		String l = "";
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '-') {
				x = x * -1;
			} else
				l = l + String.valueOf(num.charAt(i));

		}
		x = x * Double.parseDouble(String.valueOf(l));

		return String.valueOf(x);
	}
}