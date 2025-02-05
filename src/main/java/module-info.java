module net.datafaker {
	requires generex;
	requires org.yaml.snakeyaml;
	requires java.sql;
	requires java.management;

	exports net.datafaker;
	exports net.datafaker.annotations;
	exports net.datafaker.formats;
	exports net.datafaker.idnumbers;
	exports net.datafaker.idnumbers.pt.br;
	exports net.datafaker.providers.base;
	exports net.datafaker.providers.entertainment;
	exports net.datafaker.providers.food;
	exports net.datafaker.providers.sport;
	exports net.datafaker.providers.videogame;
	exports net.datafaker.sequence;
	exports net.datafaker.service;
	exports net.datafaker.service.files;
	exports net.datafaker.transformations;
	exports net.datafaker.transformations.sql;
}
