<?php

use Rector\Config\RectorConfig;
use Rector\Php81\Rector\FuncCall\NullToStrictStringFuncCallArgRector;
use Rector\Php84\Rector\Param\ExplicitNullableParamTypeRector;
use Rector\TypeDeclaration\Rector\ClassMethod\ReturnNeverTypeRector;
use Rector\TypeDeclaration\Rector\Property\TypedPropertyFromStrictConstructorRector;

return RectorConfig::configure()
    // register single rule
    ->withRules([
        TypedPropertyFromStrictConstructorRector::class,
        ReturnNeverTypeRector::class,
        ExplicitNullableParamTypeRector::class,
        NullToStrictStringFuncCallArgRector::class
    ])
    // here we can define, what prepared sets of rules will be applied
    ->withPreparedSets(
        deadCode: true,
        codeQuality: true,
        typeDeclarations: true,
        privatization: true,
        earlyReturn: true,
    )
    ->withPhpSets();
